(ns watt.build
  (:require [clojure.pprint :refer [pprint]]
            [clojure.string :as string]
            [clojure.data.json :as json])
  (:gen-class))

(defn- remove-prefixes [s]
  (string/replace-first s #"^(I(Steam)?|Get)" ""))

(defn- remove-suffixes [s] (string/replace-first s #"Service$" ""))

(defn- decapitalize [s]
  (string/replace-first s #"^." string/lower-case))

(defn- words [s]
  (map first (re-seq #"(([A-Z]([A-Z]+|[a-z]+)[0-9]?)|[0-9]+)(?![a-z])" s)))

(defn- hyphenate [s]
  (string/join "-" (words s)))

(defn- clojurify [s]
  (-> s remove-prefixes remove-suffixes hyphenate string/lower-case))

(defn interface->ns [i]
  (list 'ns (symbol (str "watt." (clojurify (:name i))))
        '(:require [watt.core :refer [method->fn]])))

(defn- underscore [s] (string/replace s #"-" "_"))

(defn interface->path [i]
  (str "src/watt/" (-> i :name clojurify underscore) ".clj"))

(defn- interfaces []
  (->
   (json/read-str (slurp "resources/apilist.json") :key-fn keyword)
   :apilist
   :interfaces))

(defn- param->s [p]
  (str
   (keyword (:name p))
   " ("
   (:type p)
   ")"
   (if-not (empty? (:description p)) (str " - " (:description p)))
   (if (:optional p) " (optional)")))

(defn params->s [ps]
  (string/join
   "\n"
   (conj
    (map param->s ps)
    "Parameters:")))

(defn- method-name [m]
  (symbol (str (-> m :name clojurify) "-v" (:version m))))

(defn- method->def [i m]
  (list 'def (method-name m) (list 'method->fn (:name i) m)))

(defn- highest-version [mcoll]
  (apply (partial max-key :version) mcoll))

(defn interface->methods [i]
  (mapcat
   (fn [method-group]
     (let [vmax (highest-version method-group)]
       (concat
        (map (partial method->def i) method-group)
        [(list 'def (-> vmax :name clojurify symbol) (method-name vmax))])))
   (partition-by :name (:methods i))))

(defn- pprint-str [f] (with-out-str (pprint f)))

(defn -main []
  (doseq [interface (interfaces)]
    (spit
     (interface->path interface)
     (string/join
      "\n"
      (map
       pprint-str
       (conj
        (interface->methods interface)
        (interface->ns interface)))))))
