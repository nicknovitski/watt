(ns steam.news (:require [steam.request :as r]))

(def
 news-for-app
 "Parameters:
(uint32) :appid - AppID to retrieve news for
(uint32) :maxlength - Maximum length for the content to return, if this is 0 the full content is returned, if it's less then a blurb is generated to fit. (optional)
(uint32) :enddate - Retrieve posts earlier than this date (unix epoch timestamp) (optional)
(uint32) :count - # of posts to retrieve (default 20) (optional)"
 (partial r/get "ISteamNews" "GetNewsForApp" 1))

(def
 news-for-app
 "Parameters:
(uint32) :appid - AppID to retrieve news for
(uint32) :maxlength - Maximum length for the content to return, if this is 0 the full content is returned, if it's less then a blurb is generated to fit. (optional)
(uint32) :enddate - Retrieve posts earlier than this date (unix epoch timestamp) (optional)
(uint32) :count - # of posts to retrieve (default 20) (optional)
(string) :feeds - Comma-seperated list of feed names to return news for (optional)"
 (partial r/get "ISteamNews" "GetNewsForApp" 2))
