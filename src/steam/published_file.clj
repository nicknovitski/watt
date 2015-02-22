(ns steam.published-file (:require [steam.core :refer [request]]))

(def
 query-files-v1
 "Performs a search query for published files

Parameters:
:key (string) - Access key
:query_type (uint32) - enumeration EPublishedFileQueryType in clientenums.h
:page (uint32) - Current page
:numperpage (uint32) - (Optional) The number of results, per page to return. (optional)
:creator_appid (uint32) - App that created the files
:appid (uint32) - App that consumes the files
:requiredtags (string) - Tags to match on. See match_all_tags parameter below
:excludedtags (string) - (Optional) Tags that must NOT be present on a published file to satisfy the query.
:match_all_tags (bool) - If true, then items must have all the tags specified, otherwise they must have at least one of the tags. (optional)
:required_flags (string) - Required flags that must be set on any returned items
:omitted_flags (string) - Flags that must not be set on any returned items
:search_text (string) - Text to match in the item's title or description
:filetype (uint32) - EPublishedFileInfoMatchingFileType
:child_publishedfileid (uint64) - Find all items that reference the given item.
:days (uint32) - If query_type is k_PublishedFileQueryType_RankedByTrend, then this is the number of days to get votes for [1,7].
:include_recent_votes_only (bool) - If query_type is k_PublishedFileQueryType_RankedByTrend, then limit result set just to items that have votes within the day range given
:cache_max_age_seconds (uint32) - Allow stale data to be returned for the specified number of seconds. (optional)
:totalonly (bool) - (Optional) If true, only return the total number of files that satisfy this query.
:return_vote_data (bool) - Return vote data
:return_tags (bool) - Return tags in the file details
:return_kv_tags (bool) - Return key-value tags in the file details
:return_previews (bool) - Return preview image and video details in the file details
:return_children (bool) - Return child item ids in the file details
:return_short_description (bool) - Populate the short_description field instead of file_description
:return_for_sale_data (bool) - Return pricing information, if applicable"
 (partial request "GET" "IPublishedFileService" "QueryFiles" 1))

(def query-files query-files-v1)
