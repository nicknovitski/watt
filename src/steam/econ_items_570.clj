(ns steam.econ-items-570 (:require [steam.request :as r]))

(def
 player-items-v1
 "Parameters:
(uint64) :steamid - The Steam ID to fetch items for"
 (partial r/get "IEconItems_570" "GetPlayerItems" 1))

(def player-items player-items-v1)

(def
 schema-v1
 "Parameters:
(string) :language - The language to return the names in. Defaults to returning string keys. (optional)"
 (partial r/get "IEconItems_570" "GetSchema" 1))

(def schema schema-v1)

(def schema-url-v1 (partial r/get "IEconItems_570" "GetSchemaURL" 1))

(def schema-url schema-url-v1)

(def
 store-meta-data-v1
 "Parameters:
(string) :language - The language to results in. (optional)"
 (partial r/get "IEconItems_570" "GetStoreMetaData" 1))

(def store-meta-data store-meta-data-v1)
