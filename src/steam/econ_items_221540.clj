(ns steam.econ-items-221540 (:require [steam.request :as r]))

(def
 player-items
 (partial r/get "IEconItems_221540" "GetPlayerItems" 1))
