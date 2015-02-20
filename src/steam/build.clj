(ns steam.build
  (:require [clojure.pprint :refer [pprint]]
            [clojure.string :as string]
            [steam.web-api-util :as api])
  (:gen-class))

(defn- remove-prefixes [string]
  (string/replace-first string #"^(I(Steam)?|Get)" ""))

(defn- remove-suffixes [string] (string/replace-first string #"Service$" ""))

(defn- decapitalize [string]
  (string/replace-first string #"^." string/lower-case))

(defn- words [string]
  (map first (re-seq #"(([A-Z]([A-Z]+|[a-z]+)[0-9]?)|[0-9]+)(?![a-z])" string)))

(defn- hyphenate [string]
  (string/join "-" (words string)))

(defn- clojurify [string]
  (-> string remove-prefixes remove-suffixes hyphenate .toLowerCase))

(defn- interface->ns [i]
  (list 'ns (symbol (str "steam." (clojurify (:name i))))
        '(:require [steam.request :as r])))

(defn- interface->path [i]
  (str "src/steam/" (clojurify (:name i)) ".clj"))

(defn -main []
  (doseq [interface (-> (api/supported-api-list) :body :apilist :interfaces)]
    (pprint (interface->ns interface))
