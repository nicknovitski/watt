(ns watt.gc-version-730 (:require [watt.core :refer [request]]))

(def
 server-version-v1
 (partial request "GET" "IGCVersion_730" "GetServerVersion" 1))

(def server-version server-version-v1)
