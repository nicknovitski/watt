(ns watt.cdn (:require [watt.core :refer [method->fn]]))

(def
  set-client-filters-v1
  (method->fn
   "ISteamCDN"
   {:name "SetClientFilters",
    :version 1,
    :httpmethod "POST",
    :parameters
    [{:name "key",
      :type "string",
      :optional false,
      :description "access key"}
     {:name "cdnname",
      :type "string",
      :optional false,
      :description "Steam name of CDN property"}
     {:name "allowedipblocks",
      :type "string",
      :optional true,
      :description
      "comma-separated list of allowed IP address blocks in CIDR format - blank for not used"}
     {:name "allowedasns",
      :type "string",
      :optional true,
      :description
      "comma-separated list of allowed client network AS numbers - blank for not used"}
     {:name "allowedipcountries",
      :type "string",
      :optional true,
      :description
      "comma-separated list of allowed client IP country codes in ISO 3166-1 format - blank for not used"}]}))

(def set-client-filters set-client-filters-v1)
