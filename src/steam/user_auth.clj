(ns steam.user-auth (:require [steam.core :refer [request]]))

(def
 token-details-v1
 "Parameters:
:access_token (string) - OAuth2 token for which to return details"
 (partial request "GET" "ISteamUserOAuth" "GetTokenDetails" 1))

(def token-details token-details-v1)
