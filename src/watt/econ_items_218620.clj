(ns watt.econ-items-218620 (:require [watt.core :refer [method->fn]]))

(def
  player-items-v1
  (method->fn
   "IEconItems_218620"
   {:name "GetPlayerItems",
    :version 1,
    :httpmethod "GET",
    :parameters
    [{:name "steamid",
      :type "uint64",
      :optional false,
      :description "The Steam ID to fetch items for"}]}))

(def player-items player-items-v1)
