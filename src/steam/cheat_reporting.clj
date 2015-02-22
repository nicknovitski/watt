(ns steam.cheat-reporting (:require [steam.core :refer [request]]))

(def
 report-cheat-data-v1
 "Reports cheat data. Only use on test account that is running the game but not in a multiplayer session.

Parameters:
:key (string) - Access key
:steamid (uint64) - steamid of the user running and reporting the cheat.
:appid (uint32) - The appid.
:pathandfilename (string) - path and file name of the cheat executable.
:webcheaturl (string) - web url where the cheat was found and downloaded.
:time_now (uint64) - local system time now.
:time_started (uint64) - local system time when cheat process started. ( 0 if not yet run )
:time_stopped (uint64) - local system time when cheat process stopped. ( 0 if still running )
:cheatname (string) - descriptive name for the cheat.
:game_process_id (uint32) - process ID of the running game.
:cheat_process_id (uint32) - process ID of the cheat process that ran"
 (partial request "POST" "ICheatReportingService" "ReportCheatData" 1))

(def report-cheat-data report-cheat-data-v1)
