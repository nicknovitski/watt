(ns steam.core
  (:require [steam.util :as util]
            [clj-http.client :as http]
            [clojure.data.json :as json]
            [clojure.data.xml :as xml]
            [ring.util.codec :as codec]))

(defn- get-body [uri]
  (:body (http/get uri)))

(defn get [request-map]
  (json/read-str (get-body (util/api-uri request-map))))

(defn- profile->xml-url [profile-name]
  (str "http://steamcommunity.com/id/" profile-name "?xml=1"))

(defn- content-of-first-tag [xml-string]
  (-> xml-string xml/parse-str :content first :content first read-string))

(defn profile->id [profile-name]
  (content-of-first-tag (:body (http/get (profile->xml-url profile-name)))))
