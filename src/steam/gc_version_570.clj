(ns steam.gc-version-570 (:require [steam.request :as r]))

(def
 client-version
 (partial r/get "IGCVersion_570" "GetClientVersion" 1))

(def
 server-version
 (partial r/get "IGCVersion_570" "GetServerVersion" 1))
