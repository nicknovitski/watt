(ns steam.account-recovery (:require [steam.request :as r]))

(def
 report-account-recovery-data
 "Send account recovery data

Parameters:
(string) :loginuser_list
(string) :install_config
(string) :shasentryfile
(string) :machineid"
 (partial
  r/post
  "IAccountRecoveryService"
  "ReportAccountRecoveryData"
  1))

(def
 retrieve-account-recovery-data
 "Send account recovery data

Parameters:
(string) :requesthandle"
 (partial
  r/post
  "IAccountRecoveryService"
  "RetrieveAccountRecoveryData"
  1))
