(ns steam.account-recovery (:require [steam.request :as r]))

(def
 report-account-recovery-data-v1
 "Send account recovery data

Parameters:
:loginuser_list (string)
:install_config (string)
:shasentryfile (string)
:machineid (string)"
 (partial
  r/post
  "IAccountRecoveryService"
  "ReportAccountRecoveryData"
  1))

(def report-account-recovery-data report-account-recovery-data-v1)

(def
 retrieve-account-recovery-data-v1
 "Send account recovery data

Parameters:
:requesthandle (string)"
 (partial
  r/post
  "IAccountRecoveryService"
  "RetrieveAccountRecoveryData"
  1))

(def retrieve-account-recovery-data retrieve-account-recovery-data-v1)
