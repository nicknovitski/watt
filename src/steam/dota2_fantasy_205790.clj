(ns steam.dota2-fantasy-205790 (:require [steam.request :as r]))

(def
 fantasy-player-stats-v1
 "Parameters:
:FantasyLeagueID (uint32) - The fantasy league ID
:StartTime (uint32) - An optional filter for minimum timestamp (optional)
:EndTime (uint32) - An optional filter for maximum timestamp (optional)
:matchid (uint64) - An optional filter for a specific match (optional)
:SeriesID (uint32) - An optional filter for a specific series (optional)
:PlayerAccountID (uint32) - An optional filter for a specific player (optional)"
 (partial r/get "IDOTA2Fantasy_205790" "GetFantasyPlayerStats" 1))

(def fantasy-player-stats fantasy-player-stats-v1)

(def
 player-official-info-v1
 "Parameters:
:accountid (uint32) - The account ID to look up"
 (partial r/get "IDOTA2Fantasy_205790" "GetPlayerOfficialInfo" 1))

(def player-official-info player-official-info-v1)
