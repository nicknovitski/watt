(ns
 watt.web-user-presence-auth
 (:require [watt.core :refer [method->fn]]))

(def
 poll-status-v1
 (method->fn
  "ISteamWebUserPresenceOAuth"
  {:name "PollStatus",
   :version 1,
   :httpmethod "POST",
   :parameters
   [{:name "steamid",
     :type "string",
     :optional false,
     :description "Steam ID of the user"}
    {:name "umqid",
     :type "uint64",
     :optional false,
     :description "UMQ Session ID"}
    {:name "message",
     :type "uint32",
     :optional false,
     :description "Message that was last known to the user"}
    {:name "pollid",
     :type "uint32",
     :optional true,
     :description "Caller-specific poll id"}
    {:name "sectimeout",
     :type "uint32",
     :optional true,
     :description "Long-poll timeout in seconds"}
    {:name "secidletime",
     :type "uint32",
     :optional true,
     :description
     "How many seconds is client considering itself idle, e.g. screen is off"}
    {:name "use_accountids",
     :type "uint32",
     :optional true,
     :description
     "Boolean, 0 (default): return steamid_from in output, 1: return accountid_from"}]}))

(def poll-status poll-status-v1)
