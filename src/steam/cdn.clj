(ns steam.cdn (:require [steam.request :as r]))

(def
 set-client-filters-v1
 "Parameters:
:key (string) - access key
:cdnname (string) - Steam name of CDN property
:allowedipblocks (string) - comma-separated list of allowed IP address blocks in CIDR format - blank for not used (optional)
:allowedasns (string) - comma-separated list of allowed client network AS numbers - blank for not used (optional)
:allowedipcountries (string) - comma-separated list of allowed client IP country codes in ISO 3166-1 format - blank for not used (optional)"
 (partial r/post "ISteamCDN" "SetClientFilters" 1))

(def set-client-filters set-client-filters-v1)
