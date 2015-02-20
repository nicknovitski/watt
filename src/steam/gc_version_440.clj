(ns steam.gc-version-440 (:require [steam.request :as r]))

(def
 client-version
 (partial r/get "IGCVersion_440" "GetClientVersion" 1))

(def
 server-version
 (partial r/get "IGCVersion_440" "GetServerVersion" 1))
