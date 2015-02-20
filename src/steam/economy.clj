(ns steam.economy (:require [steam.request :as r]))

(def
 asset-class-info
 (partial r/get "ISteamEconomy" "GetAssetClassInfo" 1))

(def asset-prices (partial r/get "ISteamEconomy" "GetAssetPrices" 1))
