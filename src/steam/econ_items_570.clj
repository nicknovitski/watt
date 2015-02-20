(ns steam.econ-items-570 (:require [steam.request :as r]))

(def
 player-items
 "Parameters:
(uint64) :steamid - The Steam ID to fetch items for"
 (partial r/get "IEconItems_570" "GetPlayerItems" 1))

(def
 schema
 "Parameters:
(string) :language - The language to return the names in. Defaults to returning string keys. (optional)"
 (partial r/get "IEconItems_570" "GetSchema" 1))

(def schema-url (partial r/get "IEconItems_570" "GetSchemaURL" 1))

(def
 store-meta-data
 "Parameters:
(string) :language - The language to results in. (optional)"
 (partial r/get "IEconItems_570" "GetStoreMetaData" 1))
