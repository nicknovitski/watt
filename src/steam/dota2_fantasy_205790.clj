(ns steam.dota2-fantasy-205790 (:require [steam.request :as r]))

(def
 fantasy-player-stats
 (partial r/get "IDOTA2Fantasy_205790" "GetFantasyPlayerStats" 1))

(def
 player-official-info
 (partial r/get "IDOTA2Fantasy_205790" "GetPlayerOfficialInfo" 1))
