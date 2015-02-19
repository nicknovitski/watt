(ns steam.core
  (:require [clj-http.client :as http]
            [clojure.data.xml :as xml]))

(defn- profile->xml-url [profile-name]
  (str "http://steamcommunity.com/id/" profile-name "?xml=1"))

(defn- content-of-first-tag [xml-string]
  (-> xml-string xml/parse-str :content first :content first read-string))

(defn profile->id [profile-name]
  (content-of-first-tag (:body (http/get (profile->xml-url profile-name)))))

(defn make-method [interface-name keywords])

(defn make-interface [options]
  (let [interface-name (:name options)
        interface-ns (util/name->ns interface-name)
        method-coll (:methods options)]
    (doseq [method-props method-coll]
      (make-method interface-name method-props))
    interface-ns))

