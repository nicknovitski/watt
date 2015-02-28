(ns watt.game-servers (:require [watt.core :refer [method->fn]]))

(def
 account-list-v1
 (method->fn
  "IGameServersService"
  {:name "GetAccountList",
   :version 1,
   :httpmethod "GET",
   :description
   "Gets a list of game server accounts with their logon tokens",
   :parameters
   [{:name "key",
     :type "string",
     :optional false,
     :description "Access key"}]}))

(def account-list account-list-v1)

(def
 create-account-v1
 (method->fn
  "IGameServersService"
  {:name "CreateAccount",
   :version 1,
   :httpmethod "POST",
   :description "Creates a persistent game server account",
   :parameters
   [{:name "key",
     :type "string",
     :optional false,
     :description "Access key"}
    {:name "appid",
     :type "uint32",
     :optional false,
     :description "The app to use the account for"}
    {:name "memo",
     :type "string",
     :optional false,
     :description "The memo to set on the new account"}]}))

(def create-account create-account-v1)

(def
 set-memo-v1
 (method->fn
  "IGameServersService"
  {:name "SetMemo",
   :version 1,
   :httpmethod "POST",
   :description
   "This method changes the memo associated with the game server account. Memos do not affect the account in any way. The memo shows up in the GetAccountList response and serves only as a reminder of what the account is used for.",
   :parameters
   [{:name "key",
     :type "string",
     :optional false,
     :description "Access key"}
    {:name "steamid",
     :type "uint64",
     :optional false,
     :description "The SteamID of the game server to set the memo on"}
    {:name "memo",
     :type "string",
     :optional false,
     :description "The memo to set on the new account"}]}))

(def set-memo set-memo-v1)

(def
 reset-login-token-v1
 (method->fn
  "IGameServersService"
  {:name "ResetLoginToken",
   :version 1,
   :httpmethod "POST",
   :description
   "Generates a new login token for the specified game server",
   :parameters
   [{:name "key",
     :type "string",
     :optional false,
     :description "Access key"}
    {:name "steamid",
     :type "uint64",
     :optional false,
     :description
     "The SteamID of the game server to reset the login token of"}]}))

(def reset-login-token reset-login-token-v1)

(def
 account-public-info-v1
 (method->fn
  "IGameServersService"
  {:name "GetAccountPublicInfo",
   :version 1,
   :httpmethod "GET",
   :description
   "Gets public information about a given game server account",
   :parameters
   [{:name "key",
     :type "string",
     :optional false,
     :description "Access key"}
    {:name "steamid",
     :type "uint64",
     :optional false,
     :description "The SteamID of the game server to get info on"}]}))

(def account-public-info account-public-info-v1)

(def
 server-steam-ds-by-ip-v1
 (method->fn
  "IGameServersService"
  {:name "GetServerSteamIDsByIP",
   :version 1,
   :httpmethod "GET",
   :description "Gets a list of server SteamIDs given a list of IPs",
   :parameters
   [{:name "key",
     :type "string",
     :optional false,
     :description "Access key"}
    {:name "server_ips", :type "string", :optional false}]}))

(def server-steam-ds-by-ip server-steam-ds-by-ip-v1)

(def
 server-ps-by-steam-id-v1
 (method->fn
  "IGameServersService"
  {:name "GetServerIPsBySteamID",
   :version 1,
   :httpmethod "GET",
   :description
   "Gets a list of server IP addresses given a list of SteamIDs",
   :parameters
   [{:name "key",
     :type "string",
     :optional false,
     :description "Access key"}
    {:name "server_steamids", :type "uint64", :optional false}]}))

(def server-ps-by-steam-id server-ps-by-steam-id-v1)
