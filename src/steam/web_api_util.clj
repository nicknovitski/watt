(ns steam.web-api-util (:require [steam.core :refer [request]]))

(def
 server-info-v1
 (partial request "GET" "ISteamWebAPIUtil" "GetServerInfo" 1))

(def server-info server-info-v1)

(def
 supported-api-list-v1
 "Parameters:
:key (string) - access key (optional)"
 (partial request "GET" "ISteamWebAPIUtil" "GetSupportedAPIList" 1))

(def supported-api-list supported-api-list-v1)
