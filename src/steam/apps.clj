(ns steam.apps
  (:require [steam.request :as r]))

(def ^:private get (partial r/get "ISteamApps"))

(def app-list (partial get "GetAppList" 2))

(def servers-at-address (partial get "GetServersAtAddress" 1))

(def up-to-date-check (partial get "UpToDateCheck" 1))
