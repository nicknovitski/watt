(ns watt.web-user-presence-auth (:require [watt.core :refer [request]]))

(def
 poll-status-v1
 "Parameters:
:steamid (string) - Steam ID of the user
:umqid (uint64) - UMQ Session ID
:message (uint32) - Message that was last known to the user
:pollid (uint32) - Caller-specific poll id (optional)
:sectimeout (uint32) - Long-poll timeout in seconds (optional)
:secidletime (uint32) - How many seconds is client considering itself idle, e.g. screen is off (optional)
:use_accountids (uint32) - Boolean, 0 (default): return steamid_from in output, 1: return accountid_from (optional)"
 (partial request "POST" "ISteamWebUserPresenceOAuth" "PollStatus" 1))

(def poll-status poll-status-v1)
