(ns steam.util
  (:require [clojure.string :as str]
            [ring.util.codec :as codec]))

(defn- remove-prefixes [string]
  (str/replace-first string #"^(I(Steam)?|Get)" ""))

(defn- decapitalize [string]
  (str/replace-first string #"^." str/lower-case))

(defn- hyphenate [string]
  (def any-capital-letters #"[A-Z]+")
  (str/replace (str/replace string "_" "-") any-capital-letters #(str \- (str/lower-case %))))

(defn name->symbol [string]
  (symbol (hyphenate (decapitalize (remove-prefixes string)))))

(defn version-string [version]
    (format "v%04d" (or version 1)))

(defn api-uri [map]
  (let [host "http://api.steampowered.com"
        path (clojure.string/join "/" [(:interface map) (:method map) (version-string (:version map))])
        query (codec/form-encode (dissoc map :interface :method :version))]
    (if (empty? query)
      (clojure.string/join "/" [host path])
      (clojure.string/join "/" [host path (str "?" query)]))))

