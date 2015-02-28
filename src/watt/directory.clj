(ns watt.directory (:require [watt.core :refer [method->fn]]))

(def
 cm-list-v1
 (method->fn
  "ISteamDirectory"
  {:name "GetCMList",
   :version 1,
   :httpmethod "GET",
   :parameters
   [{:name "cellid",
     :type "uint32",
     :optional false,
     :description "Client's Steam cell ID"}
    {:name "maxcount",
     :type "uint32",
     :optional true,
     :description "Max number of servers to return"}]}))

(def cm-list cm-list-v1)
