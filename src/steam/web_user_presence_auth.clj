(ns steam.web-user-presence-auth (:require [steam.request :as r]))

(def
 poll-status
 "Parameters:
(string) :steamid - Steam ID of the user
(uint64) :umqid - UMQ Session ID
(uint32) :message - Message that was last known to the user
(uint32) :pollid - Caller-specific poll id (optional)
(uint32) :sectimeout - Long-poll timeout in seconds (optional)
(uint32) :secidletime - How many seconds is client considering itself idle, e.g. screen is off (optional)
(uint32) :use_accountids - Boolean, 0 (default): return steamid_from in output, 1: return accountid_from (optional)"
 (partial r/post "ISteamWebUserPresenceOAuth" "PollStatus" 1))
