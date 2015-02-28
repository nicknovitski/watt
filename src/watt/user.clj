(ns watt.user (:require [watt.core :refer [method->fn]]))

(def
 friend-list-v1
 (method->fn
  "ISteamUser"
  {:name "GetFriendList",
   :version 1,
   :httpmethod "GET",
   :parameters
   [{:name "key",
     :type "string",
     :optional false,
     :description "access key"}
    {:name "steamid",
     :type "uint64",
     :optional false,
     :description "SteamID of user"}
    {:name "relationship",
     :type "string",
     :optional true,
     :description "relationship type (ex: friend)"}]}))

(def friend-list friend-list-v1)

(def
 player-bans-v1
 (method->fn
  "ISteamUser"
  {:name "GetPlayerBans",
   :version 1,
   :httpmethod "GET",
   :parameters
   [{:name "key",
     :type "string",
     :optional false,
     :description "access key"}
    {:name "steamids",
     :type "string",
     :optional false,
     :description "Comma-delimited list of SteamIDs"}]}))

(def player-bans player-bans-v1)

(def
 player-summaries-v1
 (method->fn
  "ISteamUser"
  {:name "GetPlayerSummaries",
   :version 1,
   :httpmethod "GET",
   :parameters
   [{:name "key",
     :type "string",
     :optional false,
     :description "access key"}
    {:name "steamids",
     :type "string",
     :optional false,
     :description "Comma-delimited list of SteamIDs"}]}))

(def
 player-summaries-v2
 (method->fn
  "ISteamUser"
  {:name "GetPlayerSummaries",
   :version 2,
   :httpmethod "GET",
   :parameters
   [{:name "key",
     :type "string",
     :optional false,
     :description "access key"}
    {:name "steamids",
     :type "string",
     :optional false,
     :description "Comma-delimited list of SteamIDs (max: 100)"}]}))

(def player-summaries player-summaries-v2)

(def
 user-group-list-v1
 (method->fn
  "ISteamUser"
  {:name "GetUserGroupList",
   :version 1,
   :httpmethod "GET",
   :parameters
   [{:name "key",
     :type "string",
     :optional false,
     :description "access key"}
    {:name "steamid",
     :type "uint64",
     :optional false,
     :description "SteamID of user"}]}))

(def user-group-list user-group-list-v1)

(def
 resolve-vanity-url-v1
 (method->fn
  "ISteamUser"
  {:name "ResolveVanityURL",
   :version 1,
   :httpmethod "GET",
   :parameters
   [{:name "key",
     :type "string",
     :optional false,
     :description "access key"}
    {:name "vanityurl",
     :type "string",
     :optional false,
     :description "The vanity URL to get a SteamID for"}
    {:name "url_type",
     :type "int32",
     :optional true,
     :description
     "The type of vanity URL. 1 (default): Individual profile, 2: Group, 3: Official game group"}]}))

(def resolve-vanity-url resolve-vanity-url-v1)
