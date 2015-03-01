(ns watt.econ-items-730 (:require [watt.core :refer [method->fn]]))

(def
  player-items-v1
  (method->fn
   "IEconItems_730"
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
  schema-v2
  (method->fn
   "IEconItems_730"
   {:name "GetSchema",
    :version 2,
    :httpmethod "GET",
    :parameters
    [{:name "language",
      :type "string",
      :optional true,
      :description
      "The language to return the names in. Defaults to returning string keys."}]}))

(def schema schema-v2)

(def
  schema-url-v2
  (method->fn
   "IEconItems_730"
   {:name "GetSchemaURL",
    :version 2,
    :httpmethod "GET",
    :parameters []}))

(def schema-url schema-url-v2)

(def
  store-meta-data-v1
  (method->fn
   "IEconItems_730"
   {:name "GetStoreMetaData",
    :version 1,
    :httpmethod "GET",
    :parameters
    [{:name "language",
      :type "string",
      :optional true,
      :description "The language to results in."}]}))

(def store-meta-data store-meta-data-v1)
