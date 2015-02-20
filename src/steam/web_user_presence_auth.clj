(ns steam.web-user-presence-auth (:require [steam.request :as r]))

(def
 poll-status
 (partial r/post "ISteamWebUserPresenceOAuth" "PollStatus" 1))
