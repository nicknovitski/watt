(ns steam.util
  (:require [clojure.string :as str]
            [ring.util.codec :as codec]))

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

(defn version-string [version]
    (format "v%04d" (or version 1)))

(defn api-uri [map]
  (let [host "http://api.steampowered.com"
        path (clojure.string/join "/" [(:interface map) (:method map) (version-string (:version map))])
        query (codec/form-encode (dissoc map :interface :method :version))]
    (if (empty? query)
      (clojure.string/join "/" [host path])
      (clojure.string/join "/" [host path (str "?" query)]))))
