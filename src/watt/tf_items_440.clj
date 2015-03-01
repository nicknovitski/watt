(ns watt.tf-items-440 (:require [watt.core :refer [method->fn]]))

(def
  golden-wrenches-v2
  (method->fn
   "ITFItems_440"
   {:name "GetGoldenWrenches",
    :version 2,
    :httpmethod "GET",
    :parameters []}))

(def golden-wrenches golden-wrenches-v2)
