(ns steam.gc-version-205790 (:require [steam.request :as r]))

(def
 client-version-v1
 (partial r/get "IGCVersion_205790" "GetClientVersion" 1))

(def client-version client-version-v1)

(def
 server-version-v1
 (partial r/get "IGCVersion_205790" "GetServerVersion" 1))

(def server-version server-version-v1)
