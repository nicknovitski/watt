(ns steam.cheat-reporting (:require [steam.request :as r]))

(def
 report-cheat-data
 "Reports cheat data. Only use on test account that is running the game but not in a multiplayer session.

Parameters:
(string) :key - Access key
(uint64) :steamid - steamid of the user running and reporting the cheat.
(uint32) :appid - The appid.
(string) :pathandfilename - path and file name of the cheat executable.
(string) :webcheaturl - web url where the cheat was found and downloaded.
(uint64) :time_now - local system time now.
(uint64) :time_started - local system time when cheat process started. ( 0 if not yet run )
(uint64) :time_stopped - local system time when cheat process stopped. ( 0 if still running )
(string) :cheatname - descriptive name for the cheat.
(uint32) :game_process_id - process ID of the running game.
(uint32) :cheat_process_id - process ID of the cheat process that ran"
 (partial r/post "ICheatReportingService" "ReportCheatData" 1))
