(ns watt.news (:require [watt.core :refer [method->fn]]))

(def
  news-for-app-v1
  (method->fn
   "ISteamNews"
   {:name "GetNewsForApp",
    :version 1,
    :httpmethod "GET",
    :parameters
    [{:name "appid",
      :type "uint32",
      :optional false,
      :description "AppID to retrieve news for"}
     {:name "maxlength",
      :type "uint32",
      :optional true,
      :description
      "Maximum length for the content to return, if this is 0 the full content is returned, if it's less then a blurb is generated to fit."}
     {:name "enddate",
      :type "uint32",
      :optional true,
      :description
      "Retrieve posts earlier than this date (unix epoch timestamp)"}
     {:name "count",
      :type "uint32",
      :optional true,
      :description "# of posts to retrieve (default 20)"}]}))

(def
  news-for-app-v2
  (method->fn
   "ISteamNews"
   {:name "GetNewsForApp",
    :version 2,
    :httpmethod "GET",
    :parameters
    [{:name "appid",
      :type "uint32",
      :optional false,
      :description "AppID to retrieve news for"}
     {:name "maxlength",
      :type "uint32",
      :optional true,
      :description
      "Maximum length for the content to return, if this is 0 the full content is returned, if it's less then a blurb is generated to fit."}
     {:name "enddate",
      :type "uint32",
      :optional true,
      :description
      "Retrieve posts earlier than this date (unix epoch timestamp)"}
     {:name "count",
      :type "uint32",
      :optional true,
      :description "# of posts to retrieve (default 20)"}
     {:name "feeds",
      :type "string",
      :optional true,
      :description
      "Comma-seperated list of feed names to return news for"}]}))

(def news-for-app news-for-app-v2)
