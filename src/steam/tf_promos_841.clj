(ns steam.tf-promos-841 (:require [steam.request :as r]))

(def
 item-id
 "Parameters:
(uint64) :steamid - The Steam ID to fetch items for
(uint32) :PromoID - The promo ID to grant an item for"
 (partial r/get "ITFPromos_841" "GetItemID" 1))

(def
 grant-item
 "Parameters:
(uint64) :steamid - The Steam ID to fetch items for
(uint32) :PromoID - The promo ID to grant an item for"
 (partial r/post "ITFPromos_841" "GrantItem" 1))
