(ns watt.tf-promos-620 (:require [watt.core :refer [request]]))

(def
 item-id-v1
 "Parameters:
:steamid (uint64) - The Steam ID to fetch items for
:PromoID (uint32) - The promo ID to grant an item for"
 (partial request "GET" "ITFPromos_620" "GetItemID" 1))

(def item-id item-id-v1)

(def
 grant-item-v1
 "Parameters:
:steamid (uint64) - The Steam ID to fetch items for
:PromoID (uint32) - The promo ID to grant an item for"
 (partial request "POST" "ITFPromos_620" "GrantItem" 1))

(def grant-item grant-item-v1)
