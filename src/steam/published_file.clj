(ns steam.published-file (:require [steam.request :as r]))

(def
 query-files-v1
 "Performs a search query for published files

Parameters:
(string) :key - Access key
(uint32) :query_type - enumeration EPublishedFileQueryType in clientenums.h
(uint32) :page - Current page
(uint32) :numperpage - (Optional) The number of results, per page to return. (optional)
(uint32) :creator_appid - App that created the files
(uint32) :appid - App that consumes the files
(string) :requiredtags - Tags to match on. See match_all_tags parameter below
(string) :excludedtags - (Optional) Tags that must NOT be present on a published file to satisfy the query.
(bool) :match_all_tags - If true, then items must have all the tags specified, otherwise they must have at least one of the tags. (optional)
(string) :required_flags - Required flags that must be set on any returned items
(string) :omitted_flags - Flags that must not be set on any returned items
(string) :search_text - Text to match in the item's title or description
(uint32) :filetype - EPublishedFileInfoMatchingFileType
(uint64) :child_publishedfileid - Find all items that reference the given item.
(uint32) :days - If query_type is k_PublishedFileQueryType_RankedByTrend, then this is the number of days to get votes for [1,7].
(bool) :include_recent_votes_only - If query_type is k_PublishedFileQueryType_RankedByTrend, then limit result set just to items that have votes within the day range given
(uint32) :cache_max_age_seconds - Allow stale data to be returned for the specified number of seconds. (optional)
(bool) :totalonly - (Optional) If true, only return the total number of files that satisfy this query.
(bool) :return_vote_data - Return vote data
(bool) :return_tags - Return tags in the file details
(bool) :return_kv_tags - Return key-value tags in the file details
(bool) :return_previews - Return preview image and video details in the file details
(bool) :return_children - Return child item ids in the file details
(bool) :return_short_description - Populate the short_description field instead of file_description
(bool) :return_for_sale_data - Return pricing information, if applicable"
 (partial r/get "IPublishedFileService" "QueryFiles" 1))

(def query-files query-files-v1)
