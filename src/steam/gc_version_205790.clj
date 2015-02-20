(ns steam.gc-version-205790 (:require [steam.request :as r]))

(def
 client-version
 (partial r/get "IGCVersion_205790" "GetClientVersion" 1))

(def
 server-version
 (partial r/get "IGCVersion_205790" "GetServerVersion" 1))
