(ns watt.user-stats (:require [watt.core :refer [request]]))

(def
 global-achievement-percentages-for-app-v1
 "Parameters:
:gameid (uint64) - GameID to retrieve the achievement percentages for"
 (partial
  request
  "GET"
  "ISteamUserStats"
  "GetGlobalAchievementPercentagesForApp"
  1))

(def
 global-achievement-percentages-for-app-v2
 "Parameters:
:gameid (uint64) - GameID to retrieve the achievement percentages for"
 (partial
  request
  "GET"
  "ISteamUserStats"
  "GetGlobalAchievementPercentagesForApp"
  2))

(def
 global-achievement-percentages-for-app
 global-achievement-percentages-for-app-v2)

(def
 global-stats-for-game-v1
 "Parameters:
:appid (uint32) - AppID that we're getting global stats for
:count (uint32) - Number of stats get data for
:name[0] (string) - Names of stat to get data for
:startdate (uint32) - Start date for daily totals (unix epoch timestamp) (optional)
:enddate (uint32) - End date for daily totals (unix epoch timestamp) (optional)"
 (partial request "GET" "ISteamUserStats" "GetGlobalStatsForGame" 1))

(def global-stats-for-game global-stats-for-game-v1)

(def
 number-of-current-players-v1
 "Parameters:
:appid (uint32) - AppID that we're getting user count for"
 (partial
  request
  "GET"
  "ISteamUserStats"
  "GetNumberOfCurrentPlayers"
  1))

(def number-of-current-players number-of-current-players-v1)

(def
 player-achievements-v1
 "Parameters:
:key (string) - access key
:steamid (uint64) - SteamID of user
:appid (uint32) - AppID to get achievements for
:l (string) - Language to return strings for (optional)"
 (partial request "GET" "ISteamUserStats" "GetPlayerAchievements" 1))

(def player-achievements player-achievements-v1)

(def
 schema-for-game-v1
 "Parameters:
:key (string) - access key
:appid (uint32) - appid of game
:l (string) - localized langauge to return (english, french, etc.) (optional)"
 (partial request "GET" "ISteamUserStats" "GetSchemaForGame" 1))

(def
 schema-for-game-v2
 "Parameters:
:key (string) - access key
:appid (uint32) - appid of game
:l (string) - localized language to return (english, french, etc.) (optional)"
 (partial request "GET" "ISteamUserStats" "GetSchemaForGame" 2))

(def schema-for-game schema-for-game-v2)

(def
 user-stats-for-game-v1
 "Parameters:
:key (string) - access key
:steamid (uint64) - SteamID of user
:appid (uint32) - appid of game"
 (partial request "GET" "ISteamUserStats" "GetUserStatsForGame" 1))

(def
 user-stats-for-game-v2
 "Parameters:
:key (string) - access key
:steamid (uint64) - SteamID of user
:appid (uint32) - appid of game"
 (partial request "GET" "ISteamUserStats" "GetUserStatsForGame" 2))

(def user-stats-for-game user-stats-for-game-v2)
