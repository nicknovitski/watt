(ns watt.dota2-fantasy-570 (:require [watt.core :refer [method->fn]]))

(def
 fantasy-player-stats-v1
 (method->fn
  "IDOTA2Fantasy_570"
  {:name "GetFantasyPlayerStats",
   :version 1,
   :httpmethod "GET",
   :parameters
   [{:name "FantasyLeagueID",
     :type "uint32",
     :optional false,
     :description "The fantasy league ID"}
    {:name "StartTime",
     :type "uint32",
     :optional true,
     :description "An optional filter for minimum timestamp"}
    {:name "EndTime",
     :type "uint32",
     :optional true,
     :description "An optional filter for maximum timestamp"}
    {:name "matchid",
     :type "uint64",
     :optional true,
     :description "An optional filter for a specific match"}
    {:name "SeriesID",
     :type "uint32",
     :optional true,
     :description "An optional filter for a specific series"}
    {:name "PlayerAccountID",
     :type "uint32",
     :optional true,
     :description "An optional filter for a specific player"}]}))

(def fantasy-player-stats fantasy-player-stats-v1)

(def
 player-official-info-v1
 (method->fn
  "IDOTA2Fantasy_570"
  {:name "GetPlayerOfficialInfo",
   :version 1,
   :httpmethod "GET",
   :parameters
   [{:name "accountid",
     :type "uint32",
     :optional false,
     :description "The account ID to look up"}]}))

(def player-official-info player-official-info-v1)
