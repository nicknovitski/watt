(ns steam.econ-items-221540 (:require [steam.core :refer [request]]))

(def
 player-items-v1
 "Parameters:
:steamid (uint64) - The Steam ID to fetch items for"
 (partial request "GET" "IEconItems_221540" "GetPlayerItems" 1))

(def player-items player-items-v1)
