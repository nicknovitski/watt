(ns steam.dota2-match-570 (:require [steam.request :as r]))

(def
 league-listing
 (partial r/get "IDOTA2Match_570" "GetLeagueListing" 1))

(def
 live-league-games
 (partial r/get "IDOTA2Match_570" "GetLiveLeagueGames" 1))

(def
 match-details
 (partial r/get "IDOTA2Match_570" "GetMatchDetails" 1))

(def
 match-history
 (partial r/get "IDOTA2Match_570" "GetMatchHistory" 1))

(def
 match-history-by-sequence-num
 (partial r/get "IDOTA2Match_570" "GetMatchHistoryBySequenceNum" 1))

(def
 scheduled-league-games
 (partial r/get "IDOTA2Match_570" "GetScheduledLeagueGames" 1))

(def
 team-info-by-team-id
 (partial r/get "IDOTA2Match_570" "GetTeamInfoByTeamID" 1))

(def
 tournament-player-stats
 (partial r/get "IDOTA2Match_570" "GetTournamentPlayerStats" 1))
