(ns watt.econ (:require [watt.core :refer [request]]))

(def
 trade-offers-v1
 "Get a list of sent or received trade offers

Parameters:
:key (string) - Access key
:get_sent_offers (bool) - Request the list of sent offers.
:get_received_offers (bool) - Request the list of received offers.
:get_descriptions (bool) - If set, the item display data for the items included in the returned trade offers will also be returned.
:language (string) - The language to use when loading item display data.
:active_only (bool) - Indicates we should only return offers which are still active, or offers that have changed in state since the time_historical_cutoff
:historical_only (bool) - Indicates we should only return offers which are not active.
:time_historical_cutoff (uint32) - When active_only is set, offers updated since this time will also be returned"
 (partial request "GET" "IEconService" "GetTradeOffers" 1))

(def trade-offers trade-offers-v1)

(def
 trade-offer-v1
 "Gets a specific trade offer

Parameters:
:key (string) - Access key
:tradeofferid (uint64)
:language (string)"
 (partial request "GET" "IEconService" "GetTradeOffer" 1))

(def trade-offer trade-offer-v1)

(def
 trade-offers-summary-v1
 "Get counts of pending and new trade offers

Parameters:
:key (string) - Access key
:time_last_visit (uint32) - The time the user last visited.  If not passed, will use the time the user last visited the trade offer page."
 (partial request "GET" "IEconService" "GetTradeOffersSummary" 1))

(def trade-offers-summary trade-offers-summary-v1)

(def
 decline-trade-offer-v1
 "Decline a trade offer someone sent to us

Parameters:
:key (string) - Access key
:tradeofferid (uint64)"
 (partial request "POST" "IEconService" "DeclineTradeOffer" 1))

(def decline-trade-offer decline-trade-offer-v1)

(def
 cancel-trade-offer-v1
 "Cancel a trade offer we sent

Parameters:
:key (string) - Access key
:tradeofferid (uint64)"
 (partial request "POST" "IEconService" "CancelTradeOffer" 1))

(def cancel-trade-offer cancel-trade-offer-v1)
