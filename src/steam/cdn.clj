(ns steam.cdn (:require [steam.request :as r]))

(def
 set-client-filters
 "Parameters:
(string) :key - access key
(string) :cdnname - Steam name of CDN property
(string) :allowedipblocks - comma-separated list of allowed IP address blocks in CIDR format - blank for not used (optional)
(string) :allowedasns - comma-separated list of allowed client network AS numbers - blank for not used (optional)
(string) :allowedipcountries - comma-separated list of allowed client IP country codes in ISO 3166-1 format - blank for not used (optional)"
 (partial r/post "ISteamCDN" "SetClientFilters" 1))
