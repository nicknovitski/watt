(ns steam.dota2-match-570 (:require [steam.request :as r]))

(def
 league-listing-v1
 (partial r/get "IDOTA2Match_570" "GetLeagueListing" 1))

(def league-listing league-listing-v1)

(def
 live-league-games-v1
 "Parameters:
(uint32) :league_id - Only show matches of the specified league id (optional)
(uint64) :match_id - Only show matches of the specified match id (optional)"
 (partial r/get "IDOTA2Match_570" "GetLiveLeagueGames" 1))

(def live-league-games live-league-games-v1)

(def
 match-details-v1
 "Parameters:
(uint64) :match_id - Match id"
 (partial r/get "IDOTA2Match_570" "GetMatchDetails" 1))

(def match-details match-details-v1)

(def
 match-history-v1
 "Parameters:
(uint32) :hero_id - The ID of the hero that must be in the matches being queried (optional)
(uint32) :game_mode - Which game mode to return matches for (optional)
(uint32) :skill - The average skill range of the match, these can be [1-3] with lower numbers being lower skill. Ignored if an account ID is specified (optional)
(string) :min_players - Minimum number of human players that must be in a match for it to be returned (optional)
(string) :account_id - An account ID to get matches from. This will fail if the user has their match history hidden (optional)
(string) :league_id - The league ID to return games from (optional)
(uint64) :start_at_match_id - The minimum match ID to start from (optional)
(string) :matches_requested - The number of requested matches to return (optional)
(string) :tournament_games_only - Whether or not tournament games should only be returned (optional)"
 (partial r/get "IDOTA2Match_570" "GetMatchHistory" 1))

(def match-history match-history-v1)

(def
 match-history-by-sequence-num-v1
 "Parameters:
(uint64) :start_at_match_seq_num (optional)
(uint32) :matches_requested (optional)"
 (partial r/get "IDOTA2Match_570" "GetMatchHistoryBySequenceNum" 1))

(def match-history-by-sequence-num match-history-by-sequence-num-v1)

(def
 scheduled-league-games-v1
 "Parameters:
(uint32) :date_min - The starting time stamp to collect scheduled games from. If ignored, it will use the current time (optional)
(uint32) :date_max - The ending time stamp. If this is more than 7 days past the starting time stamp, it will be clamped to 7 days. (optional)"
 (partial r/get "IDOTA2Match_570" "GetScheduledLeagueGames" 1))

(def scheduled-league-games scheduled-league-games-v1)

(def
 team-info-by-team-id-v1
 "Parameters:
(uint64) :start_at_team_id (optional)
(uint32) :teams_requested (optional)"
 (partial r/get "IDOTA2Match_570" "GetTeamInfoByTeamID" 1))

(def team-info-by-team-id team-info-by-team-id-v1)

(def
 tournament-player-stats-v1
 "Parameters:
(string) :account_id
(string) :league_id (optional)
(string) :hero_id (optional)
(string) :time_frame (optional)
(uint64) :match_id (optional)"
 (partial r/get "IDOTA2Match_570" "GetTournamentPlayerStats" 1))

(def tournament-player-stats tournament-player-stats-v1)
