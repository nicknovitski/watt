(ns watt.dota2-match-205790 (:require [watt.core :refer [method->fn]]))

(def
  league-listing-v1
  (method->fn
   "IDOTA2Match_205790"
   {:name "GetLeagueListing",
    :version 1,
    :httpmethod "GET",
    :parameters []}))

(def league-listing league-listing-v1)

(def
  live-league-games-v1
  (method->fn
   "IDOTA2Match_205790"
   {:name "GetLiveLeagueGames",
    :version 1,
    :httpmethod "GET",
    :parameters
    [{:name "league_id",
      :type "uint32",
      :optional true,
      :description "Only show matches of the specified league id"}
     {:name "match_id",
      :type "uint64",
      :optional true,
      :description "Only show matches of the specified match id"}]}))

(def live-league-games live-league-games-v1)

(def
  match-details-v1
  (method->fn
   "IDOTA2Match_205790"
   {:name "GetMatchDetails",
    :version 1,
    :httpmethod "GET",
    :parameters
    [{:name "match_id",
      :type "uint64",
      :optional false,
      :description "Match id"}]}))

(def match-details match-details-v1)

(def
  match-history-v1
  (method->fn
   "IDOTA2Match_205790"
   {:name "GetMatchHistory",
    :version 1,
    :httpmethod "GET",
    :parameters
    [{:name "hero_id",
      :type "uint32",
      :optional true,
      :description
      "The ID of the hero that must be in the matches being queried"}
     {:name "game_mode",
      :type "uint32",
      :optional true,
      :description "Which game mode to return matches for"}
     {:name "skill",
      :type "uint32",
      :optional true,
      :description
      "The average skill range of the match, these can be [1-3] with lower numbers being lower skill. Ignored if an account ID is specified"}
     {:name "min_players",
      :type "string",
      :optional true,
      :description
      "Minimum number of human players that must be in a match for it to be returned"}
     {:name "account_id",
      :type "string",
      :optional true,
      :description
      "An account ID to get matches from. This will fail if the user has their match history hidden"}
     {:name "league_id",
      :type "string",
      :optional true,
      :description "The league ID to return games from"}
     {:name "start_at_match_id",
      :type "uint64",
      :optional true,
      :description "The minimum match ID to start from"}
     {:name "matches_requested",
      :type "string",
      :optional true,
      :description "The number of requested matches to return"}
     {:name "tournament_games_only",
      :type "string",
      :optional true,
      :description
      "Whether or not tournament games should only be returned"}]}))

(def match-history match-history-v1)

(def
  match-history-by-sequence-num-v1
  (method->fn
   "IDOTA2Match_205790"
   {:name "GetMatchHistoryBySequenceNum",
    :version 1,
    :httpmethod "GET",
    :parameters
    [{:name "start_at_match_seq_num",
      :type "uint64",
      :optional true,
      :description ""}
     {:name "matches_requested",
      :type "uint32",
      :optional true,
      :description ""}]}))

(def match-history-by-sequence-num match-history-by-sequence-num-v1)

(def
  scheduled-league-games-v1
  (method->fn
   "IDOTA2Match_205790"
   {:name "GetScheduledLeagueGames",
    :version 1,
    :httpmethod "GET",
    :parameters
    [{:name "date_min",
      :type "uint32",
      :optional true,
      :description
      "The starting time stamp to collect scheduled games from. If ignored, it will use the current time"}
     {:name "date_max",
      :type "uint32",
      :optional true,
      :description
      "The ending time stamp. If this is more than 7 days past the starting time stamp, it will be clamped to 7 days."}]}))

(def scheduled-league-games scheduled-league-games-v1)

(def
  team-info-by-team-id-v1
  (method->fn
   "IDOTA2Match_205790"
   {:name "GetTeamInfoByTeamID",
    :version 1,
    :httpmethod "GET",
    :parameters
    [{:name "start_at_team_id",
      :type "uint64",
      :optional true,
      :description ""}
     {:name "teams_requested",
      :type "uint32",
      :optional true,
      :description ""}]}))

(def team-info-by-team-id team-info-by-team-id-v1)

(def
  tournament-player-stats-v1
  (method->fn
   "IDOTA2Match_205790"
   {:name "GetTournamentPlayerStats",
    :version 1,
    :httpmethod "GET",
    :parameters
    [{:name "account_id",
      :type "string",
      :optional false,
      :description ""}
     {:name "league_id",
      :type "string",
      :optional true,
      :description ""}
     {:name "hero_id", :type "string", :optional true, :description ""}
     {:name "time_frame",
      :type "string",
      :optional true,
      :description ""}
     {:name "match_id",
      :type "uint64",
      :optional true,
      :description ""}]}))

(def tournament-player-stats tournament-player-stats-v1)
