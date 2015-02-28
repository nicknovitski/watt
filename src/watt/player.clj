(ns watt.player (:require [watt.core :refer [method->fn]]))

(def
 recently-played-games-v1
 (method->fn
  "IPlayerService"
  {:name "GetRecentlyPlayedGames",
   :version 1,
   :httpmethod "GET",
   :description
   "Gets information about a player's recently played games",
   :parameters
   [{:name "key",
     :type "string",
     :optional false,
     :description "Access key"}
    {:name "steamid",
     :type "uint64",
     :optional false,
     :description "The player we're asking about"}
    {:name "count",
     :type "uint32",
     :optional false,
     :description "The number of games to return (0/unset: all)"}]}))

(def recently-played-games recently-played-games-v1)

(def
 owned-games-v1
 (method->fn
  "IPlayerService"
  {:name "GetOwnedGames",
   :version 1,
   :httpmethod "GET",
   :description "Return a list of games owned by the player",
   :parameters
   [{:name "key",
     :type "string",
     :optional false,
     :description "Access key"}
    {:name "steamid",
     :type "uint64",
     :optional false,
     :description "The player we're asking about"}
    {:name "include_appinfo",
     :type "bool",
     :optional false,
     :description
     "true if we want additional details (name, icon) about each game"}
    {:name "include_played_free_games",
     :type "bool",
     :optional false,
     :description
     "Free games are excluded by default.  If this is set, free games the user has played will be returned."}
    {:name "appids_filter",
     :type "uint32",
     :optional false,
     :description
     "if set, restricts result set to the passed in apps"}]}))

(def owned-games owned-games-v1)

(def
 steam-level-v1
 (method->fn
  "IPlayerService"
  {:name "GetSteamLevel",
   :version 1,
   :httpmethod "GET",
   :description "Returns the Steam Level of a user",
   :parameters
   [{:name "key",
     :type "string",
     :optional false,
     :description "Access key"}
    {:name "steamid",
     :type "uint64",
     :optional false,
     :description "The player we're asking about"}]}))

(def steam-level steam-level-v1)

(def
 badges-v1
 (method->fn
  "IPlayerService"
  {:name "GetBadges",
   :version 1,
   :httpmethod "GET",
   :description "Gets badges that are owned by a specific user",
   :parameters
   [{:name "key",
     :type "string",
     :optional false,
     :description "Access key"}
    {:name "steamid",
     :type "uint64",
     :optional false,
     :description "The player we're asking about"}]}))

(def badges badges-v1)

(def
 community-badge-progress-v1
 (method->fn
  "IPlayerService"
  {:name "GetCommunityBadgeProgress",
   :version 1,
   :httpmethod "GET",
   :description
   "Gets all the quests needed to get the specified badge, and which are completed",
   :parameters
   [{:name "key",
     :type "string",
     :optional false,
     :description "Access key"}
    {:name "steamid",
     :type "uint64",
     :optional false,
     :description "The player we're asking about"}
    {:name "badgeid",
     :type "int32",
     :optional false,
     :description "The badge we're asking about"}]}))

(def community-badge-progress community-badge-progress-v1)

(def
 playing-shared-game-v1
 (method->fn
  "IPlayerService"
  {:name "IsPlayingSharedGame",
   :version 1,
   :httpmethod "GET",
   :description
   "Returns valid lender SteamID if game currently played is borrowed",
   :parameters
   [{:name "key",
     :type "string",
     :optional false,
     :description "Access key"}
    {:name "steamid",
     :type "uint64",
     :optional false,
     :description "The player we're asking about"}
    {:name "appid_playing",
     :type "uint32",
     :optional false,
     :description "The game player is currently playing"}]}))

(def playing-shared-game playing-shared-game-v1)
