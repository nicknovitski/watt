(ns watt.gc-version-205790 (:require [watt.core :refer [method->fn]]))

(def
  client-version-v1
  (method->fn
   "IGCVersion_205790"
   {:name "GetClientVersion",
    :version 1,
    :httpmethod "GET",
    :parameters []}))

(def client-version client-version-v1)

(def
  server-version-v1
  (method->fn
   "IGCVersion_205790"
   {:name "GetServerVersion",
    :version 1,
    :httpmethod "GET",
    :parameters []}))

(def server-version server-version-v1)
