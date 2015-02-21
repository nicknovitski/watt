(ns steam.portal2-leaderboards-841 (:require [steam.request :as r]))

(def
 bucketized-data-v1
 "Parameters:
:leaderboardName (string) - The leaderboard name to fetch data for."
 (partial r/get "IPortal2Leaderboards_841" "GetBucketizedData" 1))

(def bucketized-data bucketized-data-v1)
