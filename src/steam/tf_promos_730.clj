(ns steam.tf-promos-730 (:require [steam.request :as r]))

(def item-id (partial r/get "ITFPromos_730" "GetItemID" 1))

(def grant-item (partial r/post "ITFPromos_730" "GrantItem" 1))
