(ns steam.econ-items-218620 (:require [steam.request :as r]))

(def
 player-items
 (partial r/get "IEconItems_218620" "GetPlayerItems" 1))
