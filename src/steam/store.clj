(ns steam.store
  "https://wiki.teamfortress.com/wiki/User:RJackson/StorefrontAPI"
  (:require [clj-http.client :refer [request]]))

(defn featured []
  (request {:uri "http://store.steampowered.com/api/featured/"
            :method :get}))
