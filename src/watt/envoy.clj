(ns watt.envoy (:require [watt.core :refer [method->fn]]))

(def
 payment-out-notification-v1
 (method->fn
  "ISteamEnvoy"
  {:name "PaymentOutNotification",
   :version 1,
   :httpmethod "POST",
   :parameters []}))

(def payment-out-notification payment-out-notification-v1)

(def
 payment-out-reversal-notification-v1
 (method->fn
  "ISteamEnvoy"
  {:name "PaymentOutReversalNotification",
   :version 1,
   :httpmethod "POST",
   :parameters []}))

(def
 payment-out-reversal-notification
 payment-out-reversal-notification-v1)
