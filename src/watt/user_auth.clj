(ns watt.user-auth (:require [watt.core :refer [method->fn]]))

(def
  token-details-v1
  (method->fn
   "ISteamUserOAuth"
   {:name "GetTokenDetails",
    :version 1,
    :httpmethod "GET",
    :parameters
    [{:name "access_token",
      :type "string",
      :optional false,
      :description "OAuth2 token for which to return details"}]}))

(def token-details token-details-v1)
