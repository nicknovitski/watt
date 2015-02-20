(ns steam.tf-promos-205790 (:require [steam.request :as r]))

(def item-id (partial r/get "ITFPromos_205790" "GetItemID" 1))

(def grant-item (partial r/post "ITFPromos_205790" "GrantItem" 1))
