(ns steam.web-api-util (:require [steam.request :as r]))

(def server-info (partial r/get "ISteamWebAPIUtil" "GetServerInfo" 1))

(def
 supported-api-list
 (partial r/get "ISteamWebAPIUtil" "GetSupportedAPIList" 1))
