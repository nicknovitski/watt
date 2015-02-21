(ns steam.csgo-servers-730 (:require [steam.request :as r]))

(def
 game-servers-status-v1
 (partial r/get "ICSGOServers_730" "GetGameServersStatus" 1))

(def game-servers-status game-servers-status-v1)
