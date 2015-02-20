(ns steam.cheat-reporting (:require [steam.request :as r]))

(def
 report-cheat-data
 (partial r/post "ICheatReportingService" "ReportCheatData" 1))
