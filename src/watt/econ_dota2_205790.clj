(ns watt.econ-dota2-205790 (:require [watt.core :refer [method->fn]]))

(def
  event-stats-for-account-v1
  (method->fn
   "IEconDOTA2_205790"
   {:name "GetEventStatsForAccount",
    :version 1,
    :httpmethod "GET",
    :parameters
    [{:name "eventid",
      :type "uint32",
      :optional false,
      :description
      "The League ID of the compendium you're looking for."}
     {:name "accountid",
      :type "uint32",
      :optional false,
      :description "The account ID to look up."}
     {:name "language",
      :type "string",
      :optional true,
      :description "The language to provide hero names in."}]}))

(def event-stats-for-account event-stats-for-account-v1)

(def
  game-items-v1
  (method->fn
   "IEconDOTA2_205790"
   {:name "GetGameItems",
    :version 1,
    :httpmethod "GET",
    :parameters
    [{:name "language",
      :type "string",
      :optional true,
      :description "The language to provide item names in."}]}))

(def game-items game-items-v1)

(def
  heroes-v1
  (method->fn
   "IEconDOTA2_205790"
   {:name "GetHeroes",
    :version 1,
    :httpmethod "GET",
    :parameters
    [{:name "language",
      :type "string",
      :optional true,
      :description "The language to provide hero names in."}
     {:name "itemizedonly",
      :type "bool",
      :optional true,
      :description "Return a list of itemized heroes only."}]}))

(def heroes heroes-v1)

(def
  item-icon-path-v1
  (method->fn
   "IEconDOTA2_205790"
   {:name "GetItemIconPath",
    :version 1,
    :httpmethod "GET",
    :parameters
    [{:name "iconname",
      :type "string",
      :optional false,
      :description "The item icon name to get the CDN path of"}]}))

(def item-icon-path item-icon-path-v1)

(def
  rarities-v1
  (method->fn
   "IEconDOTA2_205790"
   {:name "GetRarities",
    :version 1,
    :httpmethod "GET",
    :parameters
    [{:name "language",
      :type "string",
      :optional true,
      :description "The language to provide rarity names in."}]}))

(def rarities rarities-v1)

(def
  tournament-prize-pool-v1
  (method->fn
   "IEconDOTA2_205790"
   {:name "GetTournamentPrizePool",
    :version 1,
    :httpmethod "GET",
    :parameters
    [{:name "leagueid",
      :type "uint32",
      :optional true,
      :description "The ID of the league to get the prize pool of"}]}))

(def tournament-prize-pool tournament-prize-pool-v1)
