(ns watt.csgo-servers-730 (:require [watt.core :refer [method->fn]]))

(def
  game-servers-status-v1
  (method->fn
   "ICSGOServers_730"
   {:name "GetGameServersStatus",
    :version 1,
    :httpmethod "GET",
    :parameters []}))

(def game-servers-status game-servers-status-v1)
