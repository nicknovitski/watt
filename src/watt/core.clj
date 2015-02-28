(ns watt.core
  (:require [clojure.string :as string]
            [clj-http.client :as http]
            [ring.util.codec :as codec]))

(defn- version-string [version] (format "v%04d" version))

(defn- url [interface method version]
  (let [host "http://api.steampowered.com"]
    (string/join
      "/"
      [host
       interface
       method
       (version-string version)])))

(defn- form-encode [m]
  (codec/form-encode (into {} (remove (comp nil? second) m))))

(defn- with-env-key [m]
  (merge {:key (System/getenv "STEAM_API_KEY")} m))

(defn- query [m]
  (form-encode (with-env-key m)))

(defn- split-map [m ks]
  (let [listed (select-keys m ks)]
    (if (nil? m)
      [listed {}]
      [listed (apply (partial dissoc m) ks)])))

(defn- split-steam-and-http-params [m parameters]
  (split-map m (map (comp keyword :name) parameters)))

(defn- parameters->preconditions [parameters]
  (hash-map :pre (vec (map #(list (keyword (:name %)) 'args) parameters))))

(defn- without-nil-values [m]
  (into {} (remove (comp nil? second) m)))

(def query-params (comp without-nil-values with-env-key))

(defn method->fn [i m]
  (let [{n :name version :version httpmethod :httpmethod parameters :parameters} m]
    (fn [& {:as args}]
      (let [[steam-params request-args] (split-steam-and-http-params args parameters)
            http-args {:method (keyword (string/lower-case httpmethod))
                       :url (url i n version)
                       :query-params (query-params steam-params)
                       :as :json}]
        (http/request (merge request-args http-args))))))
