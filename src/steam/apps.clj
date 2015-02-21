(ns steam.apps (:require [steam.request :as r]))

(def app-list-v1 (partial r/get "ISteamApps" "GetAppList" 1))

(def app-list-v2 (partial r/get "ISteamApps" "GetAppList" 2))

(def app-list app-list-v2)

(def
 servers-at-address-v1
 "Parameters:
(string) :addr - IP or IP:queryport to list"
 (partial r/get "ISteamApps" "GetServersAtAddress" 1))

(def servers-at-address servers-at-address-v1)

(def
 up-to-date-check-v1
 "Parameters:
(uint32) :appid - AppID of game
(uint32) :version - The installed version of the game"
 (partial r/get "ISteamApps" "UpToDateCheck" 1))

(def up-to-date-check up-to-date-check-v1)
