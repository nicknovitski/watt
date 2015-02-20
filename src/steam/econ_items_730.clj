(ns steam.econ-items-730 (:require [steam.request :as r]))

(def player-items (partial r/get "IEconItems_730" "GetPlayerItems" 1))

(def schema (partial r/get "IEconItems_730" "GetSchema" 2))

(def schema-url (partial r/get "IEconItems_730" "GetSchemaURL" 2))

(def
 store-meta-data
 (partial r/get "IEconItems_730" "GetStoreMetaData" 1))
