(ns
 watt.pay-pal-payments-hub
  (:require [watt.core :refer [method->fn]]))

(def
  pay-pal-payments-hub-payment-notification-v1
  (method->fn
   "ISteamPayPalPaymentsHub"
   {:name "PayPalPaymentsHubPaymentNotification",
    :version 1,
    :httpmethod "POST",
    :parameters []}))

(def
  pay-pal-payments-hub-payment-notification
  pay-pal-payments-hub-payment-notification-v1)
