(ns watt.economy (:require [watt.core :refer [method->fn]]))

(def
  asset-class-info-v1
  (method->fn
   "ISteamEconomy"
   {:name "GetAssetClassInfo",
    :version 1,
    :httpmethod "GET",
    :parameters
    [{:name "appid",
      :type "uint32",
      :optional false,
      :description "Must be a steam economy app."}
     {:name "language",
      :type "string",
      :optional true,
      :description "The user's local language"}
     {:name "class_count",
      :type "uint32",
      :optional false,
      :description "Number of classes requested. Must be at least one."}
     {:name "classid0",
      :type "uint64",
      :optional false,
      :description "Class ID of the nth class."}
     {:name "instanceid0",
      :type "uint64",
      :optional true,
      :description "Instance ID of the nth class."}]}))

(def asset-class-info asset-class-info-v1)

(def
  asset-prices-v1
  (method->fn
   "ISteamEconomy"
   {:name "GetAssetPrices",
    :version 1,
    :httpmethod "GET",
    :parameters
    [{:name "appid",
      :type "uint32",
      :optional false,
      :description "Must be a steam economy app."}
     {:name "currency",
      :type "string",
      :optional true,
      :description "The currency to filter for"}
     {:name "language",
      :type "string",
      :optional true,
      :description "The user's local language"}]}))

(def asset-prices asset-prices-v1)
