(ns steam.core
  (:require [clojure.string :as str]
            [clj-http.client :as http]
            [ring.util.codec :as codec]))

(defn- version-string [version] (format "v%04d" version))

(defn- path [interface method version]
  (clojure.string/join
    "/"
    [interface method (version-string version)]))

(defn form-encode [m]
  (codec/form-encode (into {} (remove (comp nil? second) m))))

(defn- with-env-key [m]
  (merge {:key (System/getenv "STEAM_API_KEY")} m))

(defn- uri [interface method version {:as q}]
  (let [host "http://api.steampowered.com"]
    (clojure.string/join
      "/"
      [host
       (path interface method version)
       (str "?" (form-encode (with-env-key q)))])))

(defn get [interface method version & {:as args}]
  (http/get (uri interface method version args) {:as :json}))
