(ns steam.meta
  (:require [clojure.string :as str]))

(defn- remove-prefixes [string]
  (str/replace-first string #"^(I(Steam)?|Get)" ""))

(defn- decapitalize [string]
  (str/replace-first string #"^." str/lower-case))

(defn- insert-hyphens [string]
  (let [lower-case (str/lower-case string)
        length (count string)]
    (str
      \-
      (if (< length 3)
        lower-case
        (let [last-character (subs lower-case (dec length))
              all-but-last-character (subs lower-case 0 (dec length))]
          (str all-but-last-character \- last-character))))))

(defn- hyphenate [string]
  (let [any-capitals #"[A-Z]+"]
    (str/replace
      (str/replace string "_" "-")
      any-capitals
      insert-hyphens)))

(defn clojurify [string]
  (hyphenate (decapitalize (remove-prefixes string))))

(defn name->symbol [string]
  (symbol (clojurify string)))

(defn name->ns [string]
  (list 'ns (symbol (str "steam." (name->symbol string)))
        '(:require [steam.core :as api])))

(defn make-method [interface-name keywords])

(defn make-interface [options]
  (let [interface-name (:name options)
        interface-ns (name->ns interface-name)
        method-coll (:methods options)]
    (doseq [method-props method-coll]
      (make-method interface-name method-props))
    interface-ns))
