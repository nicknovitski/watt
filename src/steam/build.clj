(ns steam.build
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

(defn- interface->ns [i]
  (list 'ns (symbol (str "steam." (clojurify (:name i))))
        '(:require [steam.request :as r])))

(defn- underscore [s] (string/replace s #"-" "_"))

(defn- interface->path [i]
  (str "src/steam/" (-> i :name clojurify underscore) ".clj"))

(defn- interfaces []
  (->
    (json/read-str (slurp "resources/apilist.json") :key-fn keyword)
    :apilist
    :interfaces))

(defn- method->requestfn [m]
  (case (:httpmethod m)
    "GET" 'r/get
    "POST" 'r/post))

(defn- param->s [p]
  (str
    (keyword (:name p))
    " ("
    (:type p)
    ")"
    (if-not (empty? (:description p)) (str " - " (:description p)))
    (if (:optional p) " (optional)")))

(defn- ppstr [f] (with-out-str (pprint f)))

(defn params->s [ps]
  (string/join
    "\n"
    (conj
      (map param->s ps)
      "Parameters:")))

(defn- docstring [m]
  (if (empty? (:parameters m))
    (:description m)
    (if (empty? (:description m))
      (params->s (:parameters m))
      (string/join
        "\n\n"
        [(:description m) (params->s (:parameters m))]))))

(defn- method-name [m]
  (symbol (str (-> m :name clojurify) "-v" (:version m))))

(defn- method->def [i m]
  (let [body (list 'partial (method->requestfn m) (:name i) (:name m) (:version m))]
    (if-let [ds (docstring m)]
      (list 'def (method-name m) ds body)
      (list 'def (method-name m) body))))

(defn- highest-version [mcoll]
  (apply (partial max-key :version) mcoll))

(defn- interface->methods [i]
  (mapcat
    (fn [method-group]
      (let [vmax (highest-version method-group)]
        (concat
          (map (partial method->def i) method-group)
          [(list 'def (-> vmax :name clojurify symbol) (method-name vmax))])))
    (partition-by :name (:methods i))))

(defn -main []
  (doseq [interface (interfaces)]
    (spit
      (interface->path interface)
      (string/join
        "\n"
        (map
          ppstr
          (conj
            (interface->methods interface)
            (interface->ns interface)))))))
