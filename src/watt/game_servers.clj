(ns watt.game-servers (:require [watt.core :refer [request]]))

(def
 account-list-v1
 "Gets a list of game server accounts with their logon tokens

Parameters:
:key (string) - Access key"
 (partial request "GET" "IGameServersService" "GetAccountList" 1))

(def account-list account-list-v1)

(def
 create-account-v1
 "Creates a persistent game server account

Parameters:
:key (string) - Access key
:appid (uint32) - The app to use the account for
:memo (string) - The memo to set on the new account"
 (partial request "POST" "IGameServersService" "CreateAccount" 1))

(def create-account create-account-v1)

(def
 set-memo-v1
 "This method changes the memo associated with the game server account. Memos do not affect the account in any way. The memo shows up in the GetAccountList response and serves only as a reminder of what the account is used for.

Parameters:
:key (string) - Access key
:steamid (uint64) - The SteamID of the game server to set the memo on
:memo (string) - The memo to set on the new account"
 (partial request "POST" "IGameServersService" "SetMemo" 1))

(def set-memo set-memo-v1)

(def
 reset-login-token-v1
 "Generates a new login token for the specified game server

Parameters:
:key (string) - Access key
:steamid (uint64) - The SteamID of the game server to reset the login token of"
 (partial request "POST" "IGameServersService" "ResetLoginToken" 1))

(def reset-login-token reset-login-token-v1)

(def
 account-public-info-v1
 "Gets public information about a given game server account

Parameters:
:key (string) - Access key
:steamid (uint64) - The SteamID of the game server to get info on"
 (partial request "GET" "IGameServersService" "GetAccountPublicInfo" 1))

(def account-public-info account-public-info-v1)

(def
 server-steam-ds-by-ip-v1
 "Gets a list of server SteamIDs given a list of IPs

Parameters:
:key (string) - Access key
:server_ips (string)"
 (partial
  request
  "GET"
  "IGameServersService"
  "GetServerSteamIDsByIP"
  1))

(def server-steam-ds-by-ip server-steam-ds-by-ip-v1)

(def
 server-ps-by-steam-id-v1
 "Gets a list of server IP addresses given a list of SteamIDs

Parameters:
:key (string) - Access key
:server_steamids (uint64)"
 (partial
  request
  "GET"
  "IGameServersService"
  "GetServerIPsBySteamID"
  1))

(def server-ps-by-steam-id server-ps-by-steam-id-v1)
