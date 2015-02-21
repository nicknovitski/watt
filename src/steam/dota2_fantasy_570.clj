(ns steam.dota2-fantasy-570 (:require [steam.request :as r]))

(def
 fantasy-player-stats-v1
 "Parameters:
(uint32) :FantasyLeagueID - The fantasy league ID
(uint32) :StartTime - An optional filter for minimum timestamp (optional)
(uint32) :EndTime - An optional filter for maximum timestamp (optional)
(uint64) :matchid - An optional filter for a specific match (optional)
(uint32) :SeriesID - An optional filter for a specific series (optional)
(uint32) :PlayerAccountID - An optional filter for a specific player (optional)"
 (partial r/get "IDOTA2Fantasy_570" "GetFantasyPlayerStats" 1))

(def fantasy-player-stats fantasy-player-stats-v1)

(def
 player-official-info-v1
 "Parameters:
(uint32) :accountid - The account ID to look up"
 (partial r/get "IDOTA2Fantasy_570" "GetPlayerOfficialInfo" 1))

(def player-official-info player-official-info-v1)
