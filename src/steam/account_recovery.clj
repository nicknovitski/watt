(ns steam.account-recovery (:require [steam.request :as r]))

(def
 report-account-recovery-data
 (partial
  r/post
  "IAccountRecoveryService"
  "ReportAccountRecoveryData"
  1))

(def
 retrieve-account-recovery-data
 (partial
  r/post
  "IAccountRecoveryService"
  "RetrieveAccountRecoveryData"
  1))
