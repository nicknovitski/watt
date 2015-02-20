(ns steam.apps (:require [steam.request :as r]))

(def app-list (partial r/get "ISteamApps" "GetAppList" 1))

(def app-list (partial r/get "ISteamApps" "GetAppList" 2))

(def
 servers-at-address
 (partial r/get "ISteamApps" "GetServersAtAddress" 1))

(def up-to-date-check (partial r/get "ISteamApps" "UpToDateCheck" 1))
