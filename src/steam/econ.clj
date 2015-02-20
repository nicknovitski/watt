(ns steam.econ (:require [steam.request :as r]))

(def trade-offers (partial r/get "IEconService" "GetTradeOffers" 1))

(def trade-offer (partial r/get "IEconService" "GetTradeOffer" 1))

(def
 trade-offers-summary
 (partial r/get "IEconService" "GetTradeOffersSummary" 1))

(def
 decline-trade-offer
 (partial r/post "IEconService" "DeclineTradeOffer" 1))

(def
 cancel-trade-offer
 (partial r/post "IEconService" "CancelTradeOffer" 1))
