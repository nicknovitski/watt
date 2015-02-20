(ns steam.econ-items-238460 (:require [steam.request :as r]))

(def
 player-items
 (partial r/get "IEconItems_238460" "GetPlayerItems" 1))
