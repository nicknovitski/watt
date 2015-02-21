(ns steam.remote-storage (:require [steam.request :as r]))

(def
 collection-details-v1
 "Parameters:
(uint32) :collectioncount - Number of collections being requested
(uint64) :publishedfileids[0] - collection ids to get the details for"
 (partial r/post "ISteamRemoteStorage" "GetCollectionDetails" 1))

(def collection-details collection-details-v1)

(def
 published-file-details-v1
 "Parameters:
(uint32) :itemcount - Number of items being requested
(uint64) :publishedfileids[0] - published file id to look up"
 (partial r/post "ISteamRemoteStorage" "GetPublishedFileDetails" 1))

(def published-file-details published-file-details-v1)

(def
 ugc-file-details-v1
 "Parameters:
(uint64) :steamid - If specified, only returns details if the file is owned by the SteamID specified (optional)
(uint64) :ugcid - ID of UGC file to get info for
(uint32) :appid - appID of product"
 (partial r/get "ISteamRemoteStorage" "GetUGCFileDetails" 1))

(def ugc-file-details ugc-file-details-v1)
