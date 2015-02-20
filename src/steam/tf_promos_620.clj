(ns steam.tf-promos-620 (:require [steam.request :as r]))

(def item-id (partial r/get "ITFPromos_620" "GetItemID" 1))

(def grant-item (partial r/post "ITFPromos_620" "GrantItem" 1))
