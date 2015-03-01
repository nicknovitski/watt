(ns watt.web-api-util (:require [watt.core :refer [method->fn]]))

(def
  server-info-v1
  (method->fn
   "ISteamWebAPIUtil"
   {:name "GetServerInfo",
    :version 1,
    :httpmethod "GET",
    :parameters []}))

(def server-info server-info-v1)

(def
  supported-api-list-v1
  (method->fn
   "ISteamWebAPIUtil"
   {:name "GetSupportedAPIList",
    :version 1,
    :httpmethod "GET",
    :parameters
    [{:name "key",
      :type "string",
      :optional true,
      :description "access key"}]}))

(def supported-api-list supported-api-list-v1)
