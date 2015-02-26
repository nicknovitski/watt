(ns watt.gc-version-205790 (:require [watt.core :refer [request]]))

(def
 client-version-v1
 (partial request "GET" "IGCVersion_205790" "GetClientVersion" 1))

(def client-version client-version-v1)

(def
 server-version-v1
 (partial request "GET" "IGCVersion_205790" "GetServerVersion" 1))

(def server-version server-version-v1)
