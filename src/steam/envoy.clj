(ns steam.envoy (:require [steam.core :refer [request]]))

(def
 payment-out-notification-v1
 (partial request "POST" "ISteamEnvoy" "PaymentOutNotification" 1))

(def payment-out-notification payment-out-notification-v1)

(def
 payment-out-reversal-notification-v1
 (partial
  request
  "POST"
  "ISteamEnvoy"
  "PaymentOutReversalNotification"
  1))

(def
 payment-out-reversal-notification
 payment-out-reversal-notification-v1)
