(ns steam.econ (:require [steam.request :as r]))

(def
 trade-offers-v1
 "Get a list of sent or received trade offers

Parameters:
(string) :key - Access key
(bool) :get_sent_offers - Request the list of sent offers.
(bool) :get_received_offers - Request the list of received offers.
(bool) :get_descriptions - If set, the item display data for the items included in the returned trade offers will also be returned.
(string) :language - The language to use when loading item display data.
(bool) :active_only - Indicates we should only return offers which are still active, or offers that have changed in state since the time_historical_cutoff
(bool) :historical_only - Indicates we should only return offers which are not active.
(uint32) :time_historical_cutoff - When active_only is set, offers updated since this time will also be returned"
 (partial r/get "IEconService" "GetTradeOffers" 1))

(def trade-offers trade-offers-v1)

(def
 trade-offer-v1
 "Gets a specific trade offer

Parameters:
(string) :key - Access key
(uint64) :tradeofferid
(string) :language"
 (partial r/get "IEconService" "GetTradeOffer" 1))

(def trade-offer trade-offer-v1)

(def
 trade-offers-summary-v1
 "Get counts of pending and new trade offers

Parameters:
(string) :key - Access key
(uint32) :time_last_visit - The time the user last visited.  If not passed, will use the time the user last visited the trade offer page."
 (partial r/get "IEconService" "GetTradeOffersSummary" 1))

(def trade-offers-summary trade-offers-summary-v1)

(def
 decline-trade-offer-v1
 "Decline a trade offer someone sent to us

Parameters:
(string) :key - Access key
(uint64) :tradeofferid"
 (partial r/post "IEconService" "DeclineTradeOffer" 1))

(def decline-trade-offer decline-trade-offer-v1)

(def
 cancel-trade-offer-v1
 "Cancel a trade offer we sent

Parameters:
(string) :key - Access key
(uint64) :tradeofferid"
 (partial r/post "IEconService" "CancelTradeOffer" 1))

(def cancel-trade-offer cancel-trade-offer-v1)
