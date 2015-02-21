(ns steam.news (:require [steam.request :as r]))

(def
 news-for-app-v1
 "Parameters:
:appid (uint32) - AppID to retrieve news for
:maxlength (uint32) - Maximum length for the content to return, if this is 0 the full content is returned, if it's less then a blurb is generated to fit. (optional)
:enddate (uint32) - Retrieve posts earlier than this date (unix epoch timestamp) (optional)
:count (uint32) - # of posts to retrieve (default 20) (optional)"
 (partial r/get "ISteamNews" "GetNewsForApp" 1))

(def
 news-for-app-v2
 "Parameters:
:appid (uint32) - AppID to retrieve news for
:maxlength (uint32) - Maximum length for the content to return, if this is 0 the full content is returned, if it's less then a blurb is generated to fit. (optional)
:enddate (uint32) - Retrieve posts earlier than this date (unix epoch timestamp) (optional)
:count (uint32) - # of posts to retrieve (default 20) (optional)
:feeds (string) - Comma-seperated list of feed names to return news for (optional)"
 (partial r/get "ISteamNews" "GetNewsForApp" 2))

(def news-for-app news-for-app-v2)
