(ns steam.econ-items-570 (:require [steam.request :as r]))

(def player-items (partial r/get "IEconItems_570" "GetPlayerItems" 1))

(def schema (partial r/get "IEconItems_570" "GetSchema" 1))

(def schema-url (partial r/get "IEconItems_570" "GetSchemaURL" 1))

(def
 store-meta-data
 (partial r/get "IEconItems_570" "GetStoreMetaData" 1))
