(ns steam.remote-storage (:require [steam.request :as r]))

(def
 collection-details
 (partial r/post "ISteamRemoteStorage" "GetCollectionDetails" 1))

(def
 published-file-details
 (partial r/post "ISteamRemoteStorage" "GetPublishedFileDetails" 1))

(def
 ugc-file-details
 (partial r/get "ISteamRemoteStorage" "GetUGCFileDetails" 1))
