(ns steam.player (:require [steam.request :as r]))

(def
 recently-played-games-v1
 "Gets information about a player's recently played games

Parameters:
:key (string) - Access key
:steamid (uint64) - The player we're asking about
:count (uint32) - The number of games to return (0/unset: all)"
 (partial r/get "IPlayerService" "GetRecentlyPlayedGames" 1))

(def recently-played-games recently-played-games-v1)

(def
 owned-games-v1
 "Return a list of games owned by the player

Parameters:
:key (string) - Access key
:steamid (uint64) - The player we're asking about
:include_appinfo (bool) - true if we want additional details (name, icon) about each game
:include_played_free_games (bool) - Free games are excluded by default.  If this is set, free games the user has played will be returned.
:appids_filter (uint32) - if set, restricts result set to the passed in apps"
 (partial r/get "IPlayerService" "GetOwnedGames" 1))

(def owned-games owned-games-v1)

(def
 steam-level-v1
 "Returns the Steam Level of a user

Parameters:
:key (string) - Access key
:steamid (uint64) - The player we're asking about"
 (partial r/get "IPlayerService" "GetSteamLevel" 1))

(def steam-level steam-level-v1)

(def
 badges-v1
 "Gets badges that are owned by a specific user

Parameters:
:key (string) - Access key
:steamid (uint64) - The player we're asking about"
 (partial r/get "IPlayerService" "GetBadges" 1))

(def badges badges-v1)

(def
 community-badge-progress-v1
 "Gets all the quests needed to get the specified badge, and which are completed

Parameters:
:key (string) - Access key
:steamid (uint64) - The player we're asking about
:badgeid (int32) - The badge we're asking about"
 (partial r/get "IPlayerService" "GetCommunityBadgeProgress" 1))

(def community-badge-progress community-badge-progress-v1)

(def
 playing-shared-game-v1
 "Returns valid lender SteamID if game currently played is borrowed

Parameters:
:key (string) - Access key
:steamid (uint64) - The player we're asking about
:appid_playing (uint32) - The game player is currently playing"
 (partial r/get "IPlayerService" "IsPlayingSharedGame" 1))

(def playing-shared-game playing-shared-game-v1)
