(ns steam.csgo-servers-730 (:require [steam.request :as r]))

(def
 game-servers-status
 (partial r/get "ICSGOServers_730" "GetGameServersStatus" 1))
