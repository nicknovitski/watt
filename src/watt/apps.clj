(ns watt.apps (:require [watt.core :refer [method->fn]]))

(def
  app-list-v1
  (method->fn
   "ISteamApps"
   {:name "GetAppList", :version 1, :httpmethod "GET", :parameters []}))

(def
  app-list-v2
  (method->fn
   "ISteamApps"
   {:name "GetAppList", :version 2, :httpmethod "GET", :parameters []}))

(def app-list app-list-v2)

(def
  servers-at-address-v1
  (method->fn
   "ISteamApps"
   {:name "GetServersAtAddress",
    :version 1,
    :httpmethod "GET",
    :parameters
    [{:name "addr",
      :type "string",
      :optional false,
      :description "IP or IP:queryport to list"}]}))

(def servers-at-address servers-at-address-v1)

(def
  up-to-date-check-v1
  (method->fn
   "ISteamApps"
   {:name "UpToDateCheck",
    :version 1,
    :httpmethod "GET",
    :parameters
    [{:name "appid",
      :type "uint32",
      :optional false,
      :description "AppID of game"}
     {:name "version",
      :type "uint32",
      :optional false,
      :description "The installed version of the game"}]}))

(def up-to-date-check up-to-date-check-v1)
