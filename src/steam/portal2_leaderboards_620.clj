(ns steam.portal2-leaderboards-620 (:require [steam.request :as r]))

(def
 bucketized-data
 (partial r/get "IPortal2Leaderboards_620" "GetBucketizedData" 1))
