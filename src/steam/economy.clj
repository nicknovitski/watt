(ns steam.economy (:require [steam.request :as r]))

(def
 asset-class-info-v1
 "Parameters:
:appid (uint32) - Must be a steam economy app.
:language (string) - The user's local language (optional)
:class_count (uint32) - Number of classes requested. Must be at least one.
:classid0 (uint64) - Class ID of the nth class.
:instanceid0 (uint64) - Instance ID of the nth class. (optional)"
 (partial r/get "ISteamEconomy" "GetAssetClassInfo" 1))

(def asset-class-info asset-class-info-v1)

(def
 asset-prices-v1
 "Parameters:
:appid (uint32) - Must be a steam economy app.
:currency (string) - The currency to filter for (optional)
:language (string) - The user's local language (optional)"
 (partial r/get "ISteamEconomy" "GetAssetPrices" 1))

(def asset-prices asset-prices-v1)
