(ns steam.econ-dota2-205790 (:require [steam.request :as r]))

(def
 event-stats-for-account
 (partial r/get "IEconDOTA2_205790" "GetEventStatsForAccount" 1))

(def game-items (partial r/get "IEconDOTA2_205790" "GetGameItems" 1))

(def heroes (partial r/get "IEconDOTA2_205790" "GetHeroes" 1))

(def
 item-icon-path
 (partial r/get "IEconDOTA2_205790" "GetItemIconPath" 1))

(def rarities (partial r/get "IEconDOTA2_205790" "GetRarities" 1))

(def
 tournament-prize-pool
 (partial r/get "IEconDOTA2_205790" "GetTournamentPrizePool" 1))
