(ns watt.tf-items-440 (:require [watt.core :refer [request]]))

(def
 golden-wrenches-v2
 (partial request "GET" "ITFItems_440" "GetGoldenWrenches" 2))

(def golden-wrenches golden-wrenches-v2)
