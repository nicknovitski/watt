(ns steam.econ-items-205790 (:require [steam.request :as r]))

(def
 player-items
 (partial r/get "IEconItems_205790" "GetPlayerItems" 1))

(def schema (partial r/get "IEconItems_205790" "GetSchema" 1))

(def schema-url (partial r/get "IEconItems_205790" "GetSchemaURL" 1))

(def
 store-meta-data
 (partial r/get "IEconItems_205790" "GetStoreMetaData" 1))
