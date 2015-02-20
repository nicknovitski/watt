(ns steam.published-file (:require [steam.request :as r]))

(def query-files (partial r/get "IPublishedFileService" "QueryFiles" 1))
