(ns steam.econ-items-730 (:require [steam.core :refer [request]]))

(def
 player-items-v1
 "Parameters:
:steamid (uint64) - The Steam ID to fetch items for"
 (partial request "GET" "IEconItems_730" "GetPlayerItems" 1))

(def player-items player-items-v1)

(def
 schema-v2
 "Parameters:
:language (string) - The language to return the names in. Defaults to returning string keys. (optional)"
 (partial request "GET" "IEconItems_730" "GetSchema" 2))

(def schema schema-v2)

(def
 schema-url-v2
 (partial request "GET" "IEconItems_730" "GetSchemaURL" 2))

(def schema-url schema-url-v2)

(def
 store-meta-data-v1
 "Parameters:
:language (string) - The language to results in. (optional)"
 (partial request "GET" "IEconItems_730" "GetStoreMetaData" 1))

(def store-meta-data store-meta-data-v1)
