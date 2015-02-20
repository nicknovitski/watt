(ns steam.user (:require [steam.request :as r]))

(def
 friend-list
 "Parameters:
(string) :key - access key
(uint64) :steamid - SteamID of user
(string) :relationship - relationship type (ex: friend) (optional)"
 (partial r/get "ISteamUser" "GetFriendList" 1))

(def
 player-bans
 "Parameters:
(string) :key - access key
(string) :steamids - Comma-delimited list of SteamIDs"
 (partial r/get "ISteamUser" "GetPlayerBans" 1))

(def
 player-summaries
 "Parameters:
(string) :key - access key
(string) :steamids - Comma-delimited list of SteamIDs"
 (partial r/get "ISteamUser" "GetPlayerSummaries" 1))

(def
 player-summaries
 "Parameters:
(string) :key - access key
(string) :steamids - Comma-delimited list of SteamIDs (max: 100)"
 (partial r/get "ISteamUser" "GetPlayerSummaries" 2))

(def
 user-group-list
 "Parameters:
(string) :key - access key
(uint64) :steamid - SteamID of user"
 (partial r/get "ISteamUser" "GetUserGroupList" 1))

(def
 resolve-vanity-url
 "Parameters:
(string) :key - access key
(string) :vanityurl - The vanity URL to get a SteamID for
(int32) :url_type - The type of vanity URL. 1 (default): Individual profile, 2: Group, 3: Official game group (optional)"
 (partial r/get "ISteamUser" "ResolveVanityURL" 1))
