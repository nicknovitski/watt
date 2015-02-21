(ns steam.gc-version-730 (:require [steam.request :as r]))

(def
 server-version-v1
 (partial r/get "IGCVersion_730" "GetServerVersion" 1))

(def server-version server-version-v1)
