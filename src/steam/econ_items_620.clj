(ns steam.econ-items-620 (:require [steam.request :as r]))

(def player-items (partial r/get "IEconItems_620" "GetPlayerItems" 1))

(def schema (partial r/get "IEconItems_620" "GetSchema" 1))
