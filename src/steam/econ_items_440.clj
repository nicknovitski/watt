(ns steam.econ-items-440 (:require [steam.request :as r]))

(def player-items (partial r/get "IEconItems_440" "GetPlayerItems" 1))

(def schema (partial r/get "IEconItems_440" "GetSchema" 1))

(def schema-url (partial r/get "IEconItems_440" "GetSchemaURL" 1))

(def
 store-meta-data
 (partial r/get "IEconItems_440" "GetStoreMetaData" 1))

(def store-status (partial r/get "IEconItems_440" "GetStoreStatus" 1))
