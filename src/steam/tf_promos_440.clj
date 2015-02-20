(ns steam.tf-promos-440 (:require [steam.request :as r]))

(def
 item-id
 "Parameters:
(uint64) :steamid - The Steam ID to fetch items for
(uint32) :promoid - The promo ID to grant an item for"
 (partial r/get "ITFPromos_440" "GetItemID" 1))

(def
 grant-item
 "Parameters:
(uint64) :steamid - The Steam ID to fetch items for
(uint32) :promoid - The promo ID to grant an item for"
 (partial r/post "ITFPromos_440" "GrantItem" 1))
