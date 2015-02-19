(ns steam.web-api-util
  (:require [steam.api :as api]))

(def ^:private get (partial api/get "ISteamWebAPIUtil"))

(def supported-api-list (partial get "GetSupportedAPIList" 1))

(def server-info (partial get "GetServerInfo" 1))
