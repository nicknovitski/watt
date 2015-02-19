(ns steam.util
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
  (create-ns (symbol (str "steam." (clojurify string)))))
