(ns steam.envoy (:require [steam.request :as r]))

(def
 payment-out-notification
 (partial r/post "ISteamEnvoy" "PaymentOutNotification" 1))

(def
 payment-out-reversal-notification
 (partial r/post "ISteamEnvoy" "PaymentOutReversalNotification" 1))
