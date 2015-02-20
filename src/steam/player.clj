(ns steam.player
  (:require [steam.request :as r]))

(def ^:private get (partial r/get "IPlayerService"))

(def recently-played-games (partial get "GetRecentlyPlayedGames" 1))

(def owned-games (partial get "GetOwnedGames" 1))

(def steam-level  (partial get "GetSteamLevel" 1))

(def badges (partial get "GetBadges" 1))

(def community-badge-progress (partial get "GetCommunityBadgeProgress" 1))

(def is-playing-shared-game (partial get "IsPlayingSharedGame" 1))
