(ns steam.gc-version-440 (:require [steam.core :refer [request]]))

(def
 client-version-v1
 (partial request "GET" "IGCVersion_440" "GetClientVersion" 1))

(def client-version client-version-v1)

(def
 server-version-v1
 (partial request "GET" "IGCVersion_440" "GetServerVersion" 1))

(def server-version server-version-v1)
