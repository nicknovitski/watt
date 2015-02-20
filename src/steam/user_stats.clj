(ns steam.user-stats
  (:require [steam.request :as r]))

(def ^:private get (partial r/get "ISteamUserStats"))

(def global-achievement-percentages-for-app
  (partial get "GetGlobalAchievementPercentagesForApp" 2))

; TODO: global-stats-for-game, requires array form parameters

(def number-of-current-players
  (partial get "GetNumberOfCurrentPlayers" 1))

(def player-achievements (partial get "GetPlayerAchievements" 1))

(def user-stats-for-game (partial get "GetUserStatsForGame" 2))

(def schema-for-game (partial get "GetSchemaForGame" 2))
