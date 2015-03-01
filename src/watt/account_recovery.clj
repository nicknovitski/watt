(ns watt.account-recovery (:require [watt.core :refer [method->fn]]))

(def
  report-account-recovery-data-v1
  (method->fn
   "IAccountRecoveryService"
   {:name "ReportAccountRecoveryData",
    :version 1,
    :httpmethod "POST",
    :description "Send account recovery data",
    :parameters
    [{:name "loginuser_list", :type "string", :optional false}
     {:name "install_config", :type "string", :optional false}
     {:name "shasentryfile", :type "string", :optional false}
     {:name "machineid", :type "string", :optional false}]}))

(def report-account-recovery-data report-account-recovery-data-v1)

(def
  retrieve-account-recovery-data-v1
  (method->fn
   "IAccountRecoveryService"
   {:name "RetrieveAccountRecoveryData",
    :version 1,
    :httpmethod "POST",
    :description "Send account recovery data",
    :parameters
    [{:name "requesthandle", :type "string", :optional false}]}))

(def retrieve-account-recovery-data retrieve-account-recovery-data-v1)
