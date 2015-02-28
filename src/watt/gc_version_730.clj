(ns watt.gc-version-730 (:require [watt.core :refer [method->fn]]))

(def
 server-version-v1
 (method->fn
  "IGCVersion_730"
  {:name "GetServerVersion",
   :version 1,
   :httpmethod "GET",
   :parameters []}))

(def server-version server-version-v1)
