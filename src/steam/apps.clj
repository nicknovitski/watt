(ns steam.apps (:require [steam.request :as r]))

(def app-list (partial r/get "ISteamApps" "GetAppList" 1))

(def app-list (partial r/get "ISteamApps" "GetAppList" 2))

(def
 servers-at-address
 "Parameters:
(string) :addr - IP or IP:queryport to list"
 (partial r/get "ISteamApps" "GetServersAtAddress" 1))

(def
 up-to-date-check
 "Parameters:
(uint32) :appid - AppID of game
(uint32) :version - The installed version of the game"
 (partial r/get "ISteamApps" "UpToDateCheck" 1))
