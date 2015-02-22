(ns steam.econ-dota2-205790 (:require [steam.core :refer [request]]))

(def
 event-stats-for-account-v1
 "Parameters:
:eventid (uint32) - The League ID of the compendium you're looking for.
:accountid (uint32) - The account ID to look up.
:language (string) - The language to provide hero names in. (optional)"
 (partial
  request
  "GET"
  "IEconDOTA2_205790"
  "GetEventStatsForAccount"
  1))

(def event-stats-for-account event-stats-for-account-v1)

(def
 game-items-v1
 "Parameters:
:language (string) - The language to provide item names in. (optional)"
 (partial request "GET" "IEconDOTA2_205790" "GetGameItems" 1))

(def game-items game-items-v1)

(def
 heroes-v1
 "Parameters:
:language (string) - The language to provide hero names in. (optional)
:itemizedonly (bool) - Return a list of itemized heroes only. (optional)"
 (partial request "GET" "IEconDOTA2_205790" "GetHeroes" 1))

(def heroes heroes-v1)

(def
 item-icon-path-v1
 "Parameters:
:iconname (string) - The item icon name to get the CDN path of"
 (partial request "GET" "IEconDOTA2_205790" "GetItemIconPath" 1))

(def item-icon-path item-icon-path-v1)

(def
 rarities-v1
 "Parameters:
:language (string) - The language to provide rarity names in. (optional)"
 (partial request "GET" "IEconDOTA2_205790" "GetRarities" 1))

(def rarities rarities-v1)

(def
 tournament-prize-pool-v1
 "Parameters:
:leagueid (uint32) - The ID of the league to get the prize pool of (optional)"
 (partial request "GET" "IEconDOTA2_205790" "GetTournamentPrizePool" 1))

(def tournament-prize-pool tournament-prize-pool-v1)
