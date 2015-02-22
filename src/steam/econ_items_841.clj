(ns steam.econ-items-841 (:require [steam.core :refer [request]]))

(def
 player-items-v1
 "Parameters:
:steamid (uint64) - The Steam ID to fetch items for"
 (partial request "GET" "IEconItems_841" "GetPlayerItems" 1))

(def player-items player-items-v1)

(def
 schema-v1
 "Parameters:
:language (string) - The language to return the names in. Defaults to returning string keys. (optional)"
 (partial request "GET" "IEconItems_841" "GetSchema" 1))

(def schema schema-v1)
