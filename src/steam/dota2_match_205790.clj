(ns steam.dota2-match-205790 (:require [steam.request :as r]))

(def
 league-listing
 (partial r/get "IDOTA2Match_205790" "GetLeagueListing" 1))

(def
 live-league-games
 (partial r/get "IDOTA2Match_205790" "GetLiveLeagueGames" 1))

(def
 match-details
 (partial r/get "IDOTA2Match_205790" "GetMatchDetails" 1))

(def
 match-history
 (partial r/get "IDOTA2Match_205790" "GetMatchHistory" 1))

(def
 match-history-by-sequence-num
 (partial r/get "IDOTA2Match_205790" "GetMatchHistoryBySequenceNum" 1))

(def
 scheduled-league-games
 (partial r/get "IDOTA2Match_205790" "GetScheduledLeagueGames" 1))

(def
 team-info-by-team-id
 (partial r/get "IDOTA2Match_205790" "GetTeamInfoByTeamID" 1))

(def
 tournament-player-stats
 (partial r/get "IDOTA2Match_205790" "GetTournamentPlayerStats" 1))
