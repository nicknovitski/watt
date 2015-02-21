(ns steam.web-api-util (:require [steam.request :as r]))

(def
 server-info-v1
 (partial r/get "ISteamWebAPIUtil" "GetServerInfo" 1))

(def server-info server-info-v1)

(def
 supported-api-list-v1
 "Parameters:
(string) :key - access key (optional)"
 (partial r/get "ISteamWebAPIUtil" "GetSupportedAPIList" 1))

(def supported-api-list supported-api-list-v1)
