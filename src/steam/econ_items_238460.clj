(ns steam.econ-items-238460 (:require [steam.request :as r]))

(def
 player-items-v1
 "Parameters:
(uint64) :steamid - The Steam ID to fetch items for"
 (partial r/get "IEconItems_238460" "GetPlayerItems" 1))

(def player-items player-items-v1)
