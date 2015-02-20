(ns steam.dota2-fantasy-570 (:require [steam.request :as r]))

(def
 fantasy-player-stats
 (partial r/get "IDOTA2Fantasy_570" "GetFantasyPlayerStats" 1))

(def
 player-official-info
 (partial r/get "IDOTA2Fantasy_570" "GetPlayerOfficialInfo" 1))
