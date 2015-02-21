(ns steam.econ-dota2-570 (:require [steam.request :as r]))

(def
 event-stats-for-account-v1
 "Parameters:
(uint32) :eventid - The League ID of the compendium you're looking for.
(uint32) :accountid - The account ID to look up.
(string) :language - The language to provide hero names in. (optional)"
 (partial r/get "IEconDOTA2_570" "GetEventStatsForAccount" 1))

(def event-stats-for-account event-stats-for-account-v1)

(def
 game-items-v1
 "Parameters:
(string) :language - The language to provide item names in. (optional)"
 (partial r/get "IEconDOTA2_570" "GetGameItems" 1))

(def game-items game-items-v1)

(def
 heroes-v1
 "Parameters:
(string) :language - The language to provide hero names in. (optional)
(bool) :itemizedonly - Return a list of itemized heroes only. (optional)"
 (partial r/get "IEconDOTA2_570" "GetHeroes" 1))

(def heroes heroes-v1)

(def
 item-icon-path-v1
 "Parameters:
(string) :iconname - The item icon name to get the CDN path of"
 (partial r/get "IEconDOTA2_570" "GetItemIconPath" 1))

(def item-icon-path item-icon-path-v1)

(def
 rarities-v1
 "Parameters:
(string) :language - The language to provide rarity names in. (optional)"
 (partial r/get "IEconDOTA2_570" "GetRarities" 1))

(def rarities rarities-v1)

(def
 tournament-prize-pool-v1
 "Parameters:
(uint32) :leagueid - The ID of the league to get the prize pool of (optional)"
 (partial r/get "IEconDOTA2_570" "GetTournamentPrizePool" 1))

(def tournament-prize-pool tournament-prize-pool-v1)
