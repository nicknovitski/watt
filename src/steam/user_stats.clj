(ns steam.user-stats (:require [steam.request :as r]))

(def
 global-achievement-percentages-for-app
 "Parameters:
(uint64) :gameid - GameID to retrieve the achievement percentages for"
 (partial
  r/get
  "ISteamUserStats"
  "GetGlobalAchievementPercentagesForApp"
  1))

(def
 global-achievement-percentages-for-app
 "Parameters:
(uint64) :gameid - GameID to retrieve the achievement percentages for"
 (partial
  r/get
  "ISteamUserStats"
  "GetGlobalAchievementPercentagesForApp"
  2))

(def
 global-stats-for-game
 "Parameters:
(uint32) :appid - AppID that we're getting global stats for
(uint32) :count - Number of stats get data for
(string) :name[0] - Names of stat to get data for
(uint32) :startdate - Start date for daily totals (unix epoch timestamp) (optional)
(uint32) :enddate - End date for daily totals (unix epoch timestamp) (optional)"
 (partial r/get "ISteamUserStats" "GetGlobalStatsForGame" 1))

(def
 number-of-current-players
 "Parameters:
(uint32) :appid - AppID that we're getting user count for"
 (partial r/get "ISteamUserStats" "GetNumberOfCurrentPlayers" 1))

(def
 player-achievements
 "Parameters:
(string) :key - access key
(uint64) :steamid - SteamID of user
(uint32) :appid - AppID to get achievements for
(string) :l - Language to return strings for (optional)"
 (partial r/get "ISteamUserStats" "GetPlayerAchievements" 1))

(def
 schema-for-game
 "Parameters:
(string) :key - access key
(uint32) :appid - appid of game
(string) :l - localized langauge to return (english, french, etc.) (optional)"
 (partial r/get "ISteamUserStats" "GetSchemaForGame" 1))

(def
 schema-for-game
 "Parameters:
(string) :key - access key
(uint32) :appid - appid of game
(string) :l - localized language to return (english, french, etc.) (optional)"
 (partial r/get "ISteamUserStats" "GetSchemaForGame" 2))

(def
 user-stats-for-game
 "Parameters:
(string) :key - access key
(uint64) :steamid - SteamID of user
(uint32) :appid - appid of game"
 (partial r/get "ISteamUserStats" "GetUserStatsForGame" 1))

(def
 user-stats-for-game
 "Parameters:
(string) :key - access key
(uint64) :steamid - SteamID of user
(uint32) :appid - appid of game"
 (partial r/get "ISteamUserStats" "GetUserStatsForGame" 2))
