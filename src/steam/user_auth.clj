(ns steam.user-auth (:require [steam.request :as r]))

(def
 token-details-v1
 "Parameters:
:access_token (string) - OAuth2 token for which to return details"
 (partial r/get "ISteamUserOAuth" "GetTokenDetails" 1))

(def token-details token-details-v1)
