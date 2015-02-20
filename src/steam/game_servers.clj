(ns steam.game-servers (:require [steam.request :as r]))

(def
 account-list
 (partial r/get "IGameServersService" "GetAccountList" 1))

(def
 create-account
 (partial r/post "IGameServersService" "CreateAccount" 1))

(def set-memo (partial r/post "IGameServersService" "SetMemo" 1))

(def
 reset-login-token
 (partial r/post "IGameServersService" "ResetLoginToken" 1))

(def
 account-public-info
 (partial r/get "IGameServersService" "GetAccountPublicInfo" 1))

(def
 server-steam-ds-by-ip
 (partial r/get "IGameServersService" "GetServerSteamIDsByIP" 1))

(def
 server-ps-by-steam-id
 (partial r/get "IGameServersService" "GetServerIPsBySteamID" 1))
