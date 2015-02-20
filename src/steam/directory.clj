(ns steam.directory (:require [steam.request :as r]))

(def
 cm-list
 "Parameters:
(uint32) :cellid - Client's Steam cell ID
(uint32) :maxcount - Max number of servers to return (optional)"
 (partial r/get "ISteamDirectory" "GetCMList" 1))
