(ns watt.econ-items-205790 (:require [watt.core :refer [method->fn]]))

(def
  player-items-v1
  (method->fn
   "IEconItems_205790"
   {:name "GetPlayerItems",
    :version 1,
    :httpmethod "GET",
    :parameters
    [{:name "steamid",
      :type "uint64",
      :optional false,
      :description "The Steam ID to fetch items for"}]}))

(def player-items player-items-v1)

(def
  schema-v1
  (method->fn
   "IEconItems_205790"
   {:name "GetSchema",
    :version 1,
    :httpmethod "GET",
    :parameters
    [{:name "language",
      :type "string",
      :optional true,
      :description
      "The language to return the names in. Defaults to returning string keys."}]}))

(def schema schema-v1)

(def
  schema-url-v1
  (method->fn
   "IEconItems_205790"
   {:name "GetSchemaURL",
    :version 1,
    :httpmethod "GET",
    :parameters []}))

(def schema-url schema-url-v1)

(def
  store-meta-data-v1
  (method->fn
   "IEconItems_205790"
   {:name "GetStoreMetaData",
    :version 1,
    :httpmethod "GET",
    :parameters
    [{:name "language",
      :type "string",
      :optional true,
      :description "The language to results in."}]}))

(def store-meta-data store-meta-data-v1)
