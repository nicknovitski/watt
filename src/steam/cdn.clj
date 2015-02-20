(ns steam.cdn (:require [steam.request :as r]))

(def
 set-client-filters
 (partial r/post "ISteamCDN" "SetClientFilters" 1))
