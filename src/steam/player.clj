(ns steam.player (:require [steam.request :as r]))

(def
 recently-played-games
 (partial r/get "IPlayerService" "GetRecentlyPlayedGames" 1))

(def owned-games (partial r/get "IPlayerService" "GetOwnedGames" 1))

(def steam-level (partial r/get "IPlayerService" "GetSteamLevel" 1))

(def badges (partial r/get "IPlayerService" "GetBadges" 1))

(def
 community-badge-progress
 (partial r/get "IPlayerService" "GetCommunityBadgeProgress" 1))

(def
 playing-shared-game
 (partial r/get "IPlayerService" "IsPlayingSharedGame" 1))
