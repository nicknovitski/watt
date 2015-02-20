(ns steam.tf-promos-440 (:require [steam.request :as r]))

(def item-id (partial r/get "ITFPromos_440" "GetItemID" 1))

(def grant-item (partial r/post "ITFPromos_440" "GrantItem" 1))
