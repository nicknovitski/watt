(ns watt.tf-promos-730 (:require [watt.core :refer [method->fn]]))

(def
  item-id-v1
  (method->fn
   "ITFPromos_730"
   {:name "GetItemID",
    :version 1,
    :httpmethod "GET",
    :parameters
    [{:name "steamid",
      :type "uint64",
      :optional false,
      :description "The Steam ID to fetch items for"}
     {:name "PromoID",
      :type "uint32",
      :optional false,
      :description "The promo ID to grant an item for"}]}))

(def item-id item-id-v1)

(def
  grant-item-v1
  (method->fn
   "ITFPromos_730"
   {:name "GrantItem",
    :version 1,
    :httpmethod "POST",
    :parameters
    [{:name "steamid",
      :type "uint64",
      :optional false,
      :description "The Steam ID to fetch items for"}
     {:name "PromoID",
      :type "uint32",
      :optional false,
      :description "The promo ID to grant an item for"}]}))

(def grant-item grant-item-v1)
