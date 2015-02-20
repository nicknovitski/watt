(ns steam.gc-version-730 (:require [steam.request :as r]))

(def
 server-version
 (partial r/get "IGCVersion_730" "GetServerVersion" 1))
