(ns steam.user-auth (:require [steam.request :as r]))

(def
 token-details
 "Parameters:
(string) :access_token - OAuth2 token for which to return details"
 (partial r/get "ISteamUserOAuth" "GetTokenDetails" 1))
