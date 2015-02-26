(ns watt.apps (:require [watt.core :refer [request]]))

(def app-list-v1 (partial request "GET" "ISteamApps" "GetAppList" 1))

(def app-list-v2 (partial request "GET" "ISteamApps" "GetAppList" 2))

(def app-list app-list-v2)

(def
 servers-at-address-v1
 "Parameters:
:addr (string) - IP or IP:queryport to list"
 (partial request "GET" "ISteamApps" "GetServersAtAddress" 1))

(def servers-at-address servers-at-address-v1)

(def
 up-to-date-check-v1
 "Parameters:
:appid (uint32) - AppID of game
:version (uint32) - The installed version of the game"
 (partial request "GET" "ISteamApps" "UpToDateCheck" 1))

(def up-to-date-check up-to-date-check-v1)
