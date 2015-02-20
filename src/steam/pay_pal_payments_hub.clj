(ns steam.pay-pal-payments-hub (:require [steam.request :as r]))

(def
 pay-pal-payments-hub-payment-notification
 (partial
  r/post
  "ISteamPayPalPaymentsHub"
  "PayPalPaymentsHubPaymentNotification"
  1))
