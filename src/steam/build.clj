(ns steam.build
  (:require [clojure.pprint :refer [pprint]]
            [clojure.string :as str]
            [steam.web-api-util :as api])
  (:gen-class))

(defn- remove-prefixes [string]
  (str/replace-first string #"^(I(Steam)?|Get)" ""))

(defn- remove-suffixes [string] (str/replace-first string #"Service$" ""))

(defn- decapitalize [string]
  (str/replace-first string #"^." str/lower-case))

(defn- words [string]
  (map first (re-seq #"(([A-Z]([A-Z]+|[a-z]+)[0-9]?)|[0-9]+)(?![a-z])" string)))

(defn- hyphenate [string]
  (str/join "-" (words string)))

(defn name->symbol [string]
  (-> string remove-prefixes remove-suffixes hyphenate .toLowerCase symbol))

(defn name->ns [string]
  (list 'ns (symbol (str "steam." (name->symbol string)))
        '(:require [steam.request :as r])))

(defn make-method [interface-name keywords])

(defn make-interface [options]
  (let [interface-name (:name options)
        interface-ns (name->ns interface-name)
        method-coll (:methods options)]
    (doseq [method-props method-coll]
      (make-method interface-name method-props))
    interface-ns))

(defn -main []
  (doseq [interface (-> (api/supported-api-list) :body :apilist :interfaces)]
    (pprint (name->ns (:name interface)))))
