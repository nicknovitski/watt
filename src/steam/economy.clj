(ns steam.economy (:require [steam.request :as r]))

(def
 asset-class-info-v1
 "Parameters:
(uint32) :appid - Must be a steam economy app.
(string) :language - The user's local language (optional)
(uint32) :class_count - Number of classes requested. Must be at least one.
(uint64) :classid0 - Class ID of the nth class.
(uint64) :instanceid0 - Instance ID of the nth class. (optional)"
 (partial r/get "ISteamEconomy" "GetAssetClassInfo" 1))

(def asset-class-info asset-class-info-v1)

(def
 asset-prices-v1
 "Parameters:
(uint32) :appid - Must be a steam economy app.
(string) :currency - The currency to filter for (optional)
(string) :language - The user's local language (optional)"
 (partial r/get "ISteamEconomy" "GetAssetPrices" 1))

(def asset-prices asset-prices-v1)
