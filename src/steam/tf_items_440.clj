(ns steam.tf-items-440 (:require [steam.request :as r]))

(def
 golden-wrenches
 (partial r/get "ITFItems_440" "GetGoldenWrenches" 2))
