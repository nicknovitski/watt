(ns steam.user-stats (:require [steam.request :as r]))

(def
 global-achievement-percentages-for-app
 (partial
  r/get
  "ISteamUserStats"
  "GetGlobalAchievementPercentagesForApp"
  1))

(def
 global-achievement-percentages-for-app
 (partial
  r/get
  "ISteamUserStats"
  "GetGlobalAchievementPercentagesForApp"
  2))

(def
 global-stats-for-game
 (partial r/get "ISteamUserStats" "GetGlobalStatsForGame" 1))

(def
 number-of-current-players
 (partial r/get "ISteamUserStats" "GetNumberOfCurrentPlayers" 1))

(def
 player-achievements
 (partial r/get "ISteamUserStats" "GetPlayerAchievements" 1))

(def
 schema-for-game
 (partial r/get "ISteamUserStats" "GetSchemaForGame" 1))

(def
 schema-for-game
 (partial r/get "ISteamUserStats" "GetSchemaForGame" 2))

(def
 user-stats-for-game
 (partial r/get "ISteamUserStats" "GetUserStatsForGame" 1))

(def
 user-stats-for-game
 (partial r/get "ISteamUserStats" "GetUserStatsForGame" 2))
