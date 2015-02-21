(ns steam.envoy (:require [steam.request :as r]))

(def
 payment-out-notification-v1
 (partial r/post "ISteamEnvoy" "PaymentOutNotification" 1))

(def payment-out-notification payment-out-notification-v1)

(def
 payment-out-reversal-notification-v1
 (partial r/post "ISteamEnvoy" "PaymentOutReversalNotification" 1))

(def
 payment-out-reversal-notification
 payment-out-reversal-notification-v1)
