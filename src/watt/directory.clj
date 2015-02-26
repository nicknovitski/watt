(ns watt.directory (:require [watt.core :refer [request]]))

(def
 cm-list-v1
 "Parameters:
:cellid (uint32) - Client's Steam cell ID
:maxcount (uint32) - Max number of servers to return (optional)"
 (partial request "GET" "ISteamDirectory" "GetCMList" 1))

(def cm-list cm-list-v1)
