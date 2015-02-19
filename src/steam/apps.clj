(ns steam.apps
  (:require [steam.api :as api]))

(def ^:private get (partial api/get "ISteamApps"))

(def app-list (partial get "GetAppList" 2))

(def servers-at-address (partial get "GetServersAtAddress" 1))

(def up-to-date-check (partial get "UpToDateCheck" 1))
