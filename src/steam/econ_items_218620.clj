(ns steam.econ-items-218620 (:require [steam.request :as r]))

(def
 player-items
 "Parameters:
(uint64) :steamid - The Steam ID to fetch items for"
 (partial r/get "IEconItems_218620" "GetPlayerItems" 1))
