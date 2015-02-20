(ns steam.tf-promos-570 (:require [steam.request :as r]))

(def item-id (partial r/get "ITFPromos_570" "GetItemID" 1))

(def grant-item (partial r/post "ITFPromos_570" "GrantItem" 1))
