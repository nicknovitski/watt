(ns steam.web-api-util
  (:require [steam.request :as r]))

(def ^:private get (partial r/get "ISteamWebAPIUtil"))

(def supported-api-list (partial get "GetSupportedAPIList" 1))

(def server-info (partial get "GetServerInfo" 1))
