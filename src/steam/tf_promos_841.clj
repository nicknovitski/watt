(ns steam.tf-promos-841 (:require [steam.request :as r]))

(def item-id (partial r/get "ITFPromos_841" "GetItemID" 1))

(def grant-item (partial r/post "ITFPromos_841" "GrantItem" 1))
