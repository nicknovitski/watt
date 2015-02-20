(ns steam.news (:require [steam.request :as r]))

(def news-for-app (partial r/get "ISteamNews" "GetNewsForApp" 1))

(def news-for-app (partial r/get "ISteamNews" "GetNewsForApp" 2))
