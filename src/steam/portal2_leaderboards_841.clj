(ns steam.portal2-leaderboards-841 (:require [steam.request :as r]))

(def
 bucketized-data
 "Parameters:
(string) :leaderboardName - The leaderboard name to fetch data for."
 (partial r/get "IPortal2Leaderboards_841" "GetBucketizedData" 1))
