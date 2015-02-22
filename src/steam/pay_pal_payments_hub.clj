(ns steam.pay-pal-payments-hub (:require [steam.core :refer [request]]))

(def
 pay-pal-payments-hub-payment-notification-v1
 (partial
  request
  "POST"
  "ISteamPayPalPaymentsHub"
  "PayPalPaymentsHubPaymentNotification"
  1))

(def
 pay-pal-payments-hub-payment-notification
 pay-pal-payments-hub-payment-notification-v1)
