(ns steam.user-auth (:require [steam.request :as r]))

(def
 token-details
 (partial r/get "ISteamUserOAuth" "GetTokenDetails" 1))
