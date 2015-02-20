(ns steam.build
  (:require [clojure.pprint :refer [pprint]]
            [clojure.string :as string]
            [steam.web-api-util :as api])
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
  (-> s remove-prefixes remove-suffixes hyphenate .toLowerCase))

(defn- interface->ns [i]
  (list 'ns (symbol (str "steam." (clojurify (:name i))))
        '(:require [steam.request :as r])))

(defn- underscore [s] (string/replace s #"-" "_"))

(defn- interface->path [i]
  (str "src/steam/" (-> i :name clojurify underscore) ".clj"))

(defn- interfaces []
  (-> (api/supported-api-list) :body :apilist :interfaces))

(defn- method->requestfn [m]
  (case (:httpmethod m)
    "GET" 'r/get
    "POST" 'r/post))

(defn- method [i m]
  (let [methname (-> m :name clojurify symbol)]
    (list 'def methname
       (list 'partial (method->requestfn m) (:name i) (:name m) (:version m)))))

(defn ppstr [f] (with-out-str (pprint f)))

(defn -main []
  (doseq [interface (interfaces)]
    (spit
      (interface->path interface)
      (string/join
        "\n"
        (map
          ppstr
          (conj
            (map (partial method interface) (:methods interface))
            (interface->ns interface)))))))
