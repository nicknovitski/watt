(ns steam.directory (:require [steam.request :as r]))

(def
 cm-list-v1
 "Parameters:
:cellid (uint32) - Client's Steam cell ID
:maxcount (uint32) - Max number of servers to return (optional)"
 (partial r/get "ISteamDirectory" "GetCMList" 1))

(def cm-list cm-list-v1)
