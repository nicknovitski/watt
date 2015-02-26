(ns watt.econ-items-238460 (:require [watt.core :refer [request]]))

(def
 player-items-v1
 "Parameters:
:steamid (uint64) - The Steam ID to fetch items for"
 (partial request "GET" "IEconItems_238460" "GetPlayerItems" 1))

(def player-items player-items-v1)
