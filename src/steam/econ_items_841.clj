(ns steam.econ-items-841 (:require [steam.request :as r]))

(def player-items (partial r/get "IEconItems_841" "GetPlayerItems" 1))

(def schema (partial r/get "IEconItems_841" "GetSchema" 1))
