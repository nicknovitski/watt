(ns steam.tf-promos-841 (:require [steam.request :as r]))

(def
 item-id-v1
 "Parameters:
(uint64) :steamid - The Steam ID to fetch items for
(uint32) :PromoID - The promo ID to grant an item for"
 (partial r/get "ITFPromos_841" "GetItemID" 1))

(def item-id item-id-v1)

(def
 grant-item-v1
 "Parameters:
(uint64) :steamid - The Steam ID to fetch items for
(uint32) :PromoID - The promo ID to grant an item for"
 (partial r/post "ITFPromos_841" "GrantItem" 1))

(def grant-item grant-item-v1)
