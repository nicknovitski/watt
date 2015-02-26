(ns
 watt.portal2-leaderboards-841
 (:require [watt.core :refer [request]]))

(def
 bucketized-data-v1
 "Parameters:
:leaderboardName (string) - The leaderboard name to fetch data for."
 (partial
  request
  "GET"
  "IPortal2Leaderboards_841"
  "GetBucketizedData"
  1))

(def bucketized-data bucketized-data-v1)
