(ns steam.pay-pal-payments-hub (:require [steam.request :as r]))

(def
 pay-pal-payments-hub-payment-notification-v1
 (partial
  r/post
  "ISteamPayPalPaymentsHub"
  "PayPalPaymentsHubPaymentNotification"
  1))

(def
 pay-pal-payments-hub-payment-notification
 pay-pal-payments-hub-payment-notification-v1)
