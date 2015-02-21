(ns steam.remote-storage (:require [steam.request :as r]))

(def
 collection-details-v1
 "Parameters:
:collectioncount (uint32) - Number of collections being requested
:publishedfileids[0] (uint64) - collection ids to get the details for"
 (partial r/post "ISteamRemoteStorage" "GetCollectionDetails" 1))

(def collection-details collection-details-v1)

(def
 published-file-details-v1
 "Parameters:
:itemcount (uint32) - Number of items being requested
:publishedfileids[0] (uint64) - published file id to look up"
 (partial r/post "ISteamRemoteStorage" "GetPublishedFileDetails" 1))

(def published-file-details published-file-details-v1)

(def
 ugc-file-details-v1
 "Parameters:
:steamid (uint64) - If specified, only returns details if the file is owned by the SteamID specified (optional)
:ugcid (uint64) - ID of UGC file to get info for
:appid (uint32) - appID of product"
 (partial r/get "ISteamRemoteStorage" "GetUGCFileDetails" 1))

(def ugc-file-details ugc-file-details-v1)
