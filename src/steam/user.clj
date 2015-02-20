(ns steam.user (:require [steam.request :as r]))

(def friend-list (partial r/get "ISteamUser" "GetFriendList" 1))

(def player-bans (partial r/get "ISteamUser" "GetPlayerBans" 1))

(def
 player-summaries
 (partial r/get "ISteamUser" "GetPlayerSummaries" 1))

(def
 player-summaries
 (partial r/get "ISteamUser" "GetPlayerSummaries" 2))

(def user-group-list (partial r/get "ISteamUser" "GetUserGroupList" 1))

(def
 resolve-vanity-url
 (partial r/get "ISteamUser" "ResolveVanityURL" 1))
