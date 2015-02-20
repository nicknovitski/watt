(ns steam.econ-items-730 (:require [steam.request :as r]))

(def
 player-items
 "Parameters:
(uint64) :steamid - The Steam ID to fetch items for"
 (partial r/get "IEconItems_730" "GetPlayerItems" 1))

(def
 schema
 "Parameters:
(string) :language - The language to return the names in. Defaults to returning string keys. (optional)"
 (partial r/get "IEconItems_730" "GetSchema" 2))

(def schema-url (partial r/get "IEconItems_730" "GetSchemaURL" 2))

(def
 store-meta-data
 "Parameters:
(string) :language - The language to results in. (optional)"
 (partial r/get "IEconItems_730" "GetStoreMetaData" 1))
