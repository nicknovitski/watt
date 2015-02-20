(ns steam.econ-dota2-570 (:require [steam.request :as r]))

(def
 event-stats-for-account
 (partial r/get "IEconDOTA2_570" "GetEventStatsForAccount" 1))

(def game-items (partial r/get "IEconDOTA2_570" "GetGameItems" 1))

(def heroes (partial r/get "IEconDOTA2_570" "GetHeroes" 1))

(def
 item-icon-path
 (partial r/get "IEconDOTA2_570" "GetItemIconPath" 1))

(def rarities (partial r/get "IEconDOTA2_570" "GetRarities" 1))

(def
 tournament-prize-pool
 (partial r/get "IEconDOTA2_570" "GetTournamentPrizePool" 1))
