(ns steam.dota2-match-205790 (:require [steam.core :refer [request]]))

(def
 league-listing-v1
 (partial request "GET" "IDOTA2Match_205790" "GetLeagueListing" 1))

(def league-listing league-listing-v1)

(def
 live-league-games-v1
 "Parameters:
:league_id (uint32) - Only show matches of the specified league id (optional)
:match_id (uint64) - Only show matches of the specified match id (optional)"
 (partial request "GET" "IDOTA2Match_205790" "GetLiveLeagueGames" 1))

(def live-league-games live-league-games-v1)

(def
 match-details-v1
 "Parameters:
:match_id (uint64) - Match id"
 (partial request "GET" "IDOTA2Match_205790" "GetMatchDetails" 1))

(def match-details match-details-v1)

(def
 match-history-v1
 "Parameters:
:hero_id (uint32) - The ID of the hero that must be in the matches being queried (optional)
:game_mode (uint32) - Which game mode to return matches for (optional)
:skill (uint32) - The average skill range of the match, these can be [1-3] with lower numbers being lower skill. Ignored if an account ID is specified (optional)
:min_players (string) - Minimum number of human players that must be in a match for it to be returned (optional)
:account_id (string) - An account ID to get matches from. This will fail if the user has their match history hidden (optional)
:league_id (string) - The league ID to return games from (optional)
:start_at_match_id (uint64) - The minimum match ID to start from (optional)
:matches_requested (string) - The number of requested matches to return (optional)
:tournament_games_only (string) - Whether or not tournament games should only be returned (optional)"
 (partial request "GET" "IDOTA2Match_205790" "GetMatchHistory" 1))

(def match-history match-history-v1)

(def
 match-history-by-sequence-num-v1
 "Parameters:
:start_at_match_seq_num (uint64) (optional)
:matches_requested (uint32) (optional)"
 (partial
  request
  "GET"
  "IDOTA2Match_205790"
  "GetMatchHistoryBySequenceNum"
  1))

(def match-history-by-sequence-num match-history-by-sequence-num-v1)

(def
 scheduled-league-games-v1
 "Parameters:
:date_min (uint32) - The starting time stamp to collect scheduled games from. If ignored, it will use the current time (optional)
:date_max (uint32) - The ending time stamp. If this is more than 7 days past the starting time stamp, it will be clamped to 7 days. (optional)"
 (partial
  request
  "GET"
  "IDOTA2Match_205790"
  "GetScheduledLeagueGames"
  1))

(def scheduled-league-games scheduled-league-games-v1)

(def
 team-info-by-team-id-v1
 "Parameters:
:start_at_team_id (uint64) (optional)
:teams_requested (uint32) (optional)"
 (partial request "GET" "IDOTA2Match_205790" "GetTeamInfoByTeamID" 1))

(def team-info-by-team-id team-info-by-team-id-v1)

(def
 tournament-player-stats-v1
 "Parameters:
:account_id (string)
:league_id (string) (optional)
:hero_id (string) (optional)
:time_frame (string) (optional)
:match_id (uint64) (optional)"
 (partial
  request
  "GET"
  "IDOTA2Match_205790"
  "GetTournamentPlayerStats"
  1))

(def tournament-player-stats tournament-player-stats-v1)
