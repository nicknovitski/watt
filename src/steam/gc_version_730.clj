(ns steam.gc-version-730 (:require [steam.core :refer [request]]))

(def
 server-version-v1
 (partial request "GET" "IGCVersion_730" "GetServerVersion" 1))

(def server-version server-version-v1)
