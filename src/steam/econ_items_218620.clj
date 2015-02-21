(ns steam.econ-items-218620 (:require [steam.request :as r]))

(def
 player-items-v1
 "Parameters:
:steamid (uint64) - The Steam ID to fetch items for"
 (partial r/get "IEconItems_218620" "GetPlayerItems" 1))

(def player-items player-items-v1)
