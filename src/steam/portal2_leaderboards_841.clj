(ns steam.portal2-leaderboards-841 (:require [steam.request :as r]))

(def
 bucketized-data
 (partial r/get "IPortal2Leaderboards_841" "GetBucketizedData" 1))
