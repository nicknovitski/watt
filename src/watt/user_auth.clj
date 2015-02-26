(ns watt.user-auth (:require [watt.core :refer [request]]))

(def
 token-details-v1
 "Parameters:
:access_token (string) - OAuth2 token for which to return details"
 (partial request "GET" "ISteamUserOAuth" "GetTokenDetails" 1))

(def token-details token-details-v1)
