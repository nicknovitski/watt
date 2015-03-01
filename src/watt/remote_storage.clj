(ns watt.remote-storage (:require [watt.core :refer [method->fn]]))

(def
  collection-details-v1
  (method->fn
   "ISteamRemoteStorage"
   {:name "GetCollectionDetails",
    :version 1,
    :httpmethod "POST",
    :parameters
    [{:name "collectioncount",
      :type "uint32",
      :optional false,
      :description "Number of collections being requested"}
     {:name "publishedfileids[0]",
      :type "uint64",
      :optional false,
      :description "collection ids to get the details for"}]}))

(def collection-details collection-details-v1)

(def
  published-file-details-v1
  (method->fn
   "ISteamRemoteStorage"
   {:name "GetPublishedFileDetails",
    :version 1,
    :httpmethod "POST",
    :parameters
    [{:name "itemcount",
      :type "uint32",
      :optional false,
      :description "Number of items being requested"}
     {:name "publishedfileids[0]",
      :type "uint64",
      :optional false,
      :description "published file id to look up"}]}))

(def published-file-details published-file-details-v1)

(def
  ugc-file-details-v1
  (method->fn
   "ISteamRemoteStorage"
   {:name "GetUGCFileDetails",
    :version 1,
    :httpmethod "GET",
    :parameters
    [{:name "steamid",
      :type "uint64",
      :optional true,
      :description
      "If specified, only returns details if the file is owned by the SteamID specified"}
     {:name "ugcid",
      :type "uint64",
      :optional false,
      :description "ID of UGC file to get info for"}
     {:name "appid",
      :type "uint32",
      :optional false,
      :description "appID of product"}]}))

(def ugc-file-details ugc-file-details-v1)
