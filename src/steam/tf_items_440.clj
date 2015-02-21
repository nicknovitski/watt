(ns steam.tf-items-440 (:require [steam.request :as r]))

(def
 golden-wrenches-v2
 (partial r/get "ITFItems_440" "GetGoldenWrenches" 2))

(def golden-wrenches golden-wrenches-v2)
