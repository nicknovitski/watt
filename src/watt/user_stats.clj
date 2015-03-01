(ns watt.user-stats (:require [watt.core :refer [method->fn]]))

(def
  global-achievement-percentages-for-app-v1
  (method->fn
   "ISteamUserStats"
   {:name "GetGlobalAchievementPercentagesForApp",
    :version 1,
    :httpmethod "GET",
    :parameters
    [{:name "gameid",
      :type "uint64",
      :optional false,
      :description
      "GameID to retrieve the achievement percentages for"}]}))

(def
  global-achievement-percentages-for-app-v2
  (method->fn
   "ISteamUserStats"
   {:name "GetGlobalAchievementPercentagesForApp",
    :version 2,
    :httpmethod "GET",
    :parameters
    [{:name "gameid",
      :type "uint64",
      :optional false,
      :description
      "GameID to retrieve the achievement percentages for"}]}))

(def
  global-achievement-percentages-for-app
  global-achievement-percentages-for-app-v2)

(def
  global-stats-for-game-v1
  (method->fn
   "ISteamUserStats"
   {:name "GetGlobalStatsForGame",
    :version 1,
    :httpmethod "GET",
    :parameters
    [{:name "appid",
      :type "uint32",
      :optional false,
      :description "AppID that we're getting global stats for"}
     {:name "count",
      :type "uint32",
      :optional false,
      :description "Number of stats get data for"}
     {:name "name[0]",
      :type "string",
      :optional false,
      :description "Names of stat to get data for"}
     {:name "startdate",
      :type "uint32",
      :optional true,
      :description "Start date for daily totals (unix epoch timestamp)"}
     {:name "enddate",
      :type "uint32",
      :optional true,
      :description
      "End date for daily totals (unix epoch timestamp)"}]}))

(def global-stats-for-game global-stats-for-game-v1)

(def
  number-of-current-players-v1
  (method->fn
   "ISteamUserStats"
   {:name "GetNumberOfCurrentPlayers",
    :version 1,
    :httpmethod "GET",
    :parameters
    [{:name "appid",
      :type "uint32",
      :optional false,
      :description "AppID that we're getting user count for"}]}))

(def number-of-current-players number-of-current-players-v1)

(def
  player-achievements-v1
  (method->fn
   "ISteamUserStats"
   {:name "GetPlayerAchievements",
    :version 1,
    :httpmethod "GET",
    :parameters
    [{:name "key",
      :type "string",
      :optional false,
      :description "access key"}
     {:name "steamid",
      :type "uint64",
      :optional false,
      :description "SteamID of user"}
     {:name "appid",
      :type "uint32",
      :optional false,
      :description "AppID to get achievements for"}
     {:name "l",
      :type "string",
      :optional true,
      :description "Language to return strings for"}]}))

(def player-achievements player-achievements-v1)

(def
  schema-for-game-v1
  (method->fn
   "ISteamUserStats"
   {:name "GetSchemaForGame",
    :version 1,
    :httpmethod "GET",
    :parameters
    [{:name "key",
      :type "string",
      :optional false,
      :description "access key"}
     {:name "appid",
      :type "uint32",
      :optional false,
      :description "appid of game"}
     {:name "l",
      :type "string",
      :optional true,
      :description
      "localized langauge to return (english, french, etc.)"}]}))

(def
  schema-for-game-v2
  (method->fn
   "ISteamUserStats"
   {:name "GetSchemaForGame",
    :version 2,
    :httpmethod "GET",
    :parameters
    [{:name "key",
      :type "string",
      :optional false,
      :description "access key"}
     {:name "appid",
      :type "uint32",
      :optional false,
      :description "appid of game"}
     {:name "l",
      :type "string",
      :optional true,
      :description
      "localized language to return (english, french, etc.)"}]}))

(def schema-for-game schema-for-game-v2)

(def
  user-stats-for-game-v1
  (method->fn
   "ISteamUserStats"
   {:name "GetUserStatsForGame",
    :version 1,
    :httpmethod "GET",
    :parameters
    [{:name "key",
      :type "string",
      :optional false,
      :description "access key"}
     {:name "steamid",
      :type "uint64",
      :optional false,
      :description "SteamID of user"}
     {:name "appid",
      :type "uint32",
      :optional false,
      :description "appid of game"}]}))

(def
  user-stats-for-game-v2
  (method->fn
   "ISteamUserStats"
   {:name "GetUserStatsForGame",
    :version 2,
    :httpmethod "GET",
    :parameters
    [{:name "key",
      :type "string",
      :optional false,
      :description "access key"}
     {:name "steamid",
      :type "uint64",
      :optional false,
      :description "SteamID of user"}
     {:name "appid",
      :type "uint32",
      :optional false,
      :description "appid of game"}]}))

(def user-stats-for-game user-stats-for-game-v2)
