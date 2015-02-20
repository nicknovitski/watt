(ns steam.directory (:require [steam.request :as r]))

(def cm-list (partial r/get "ISteamDirectory" "GetCMList" 1))
