package com.ganesshkumar.watchtower.models

import com.google.gson.annotations.SerializedName

data class SearchResponse (
        @SerializedName("total_count") val totalCount: Long,
        @SerializedName("incomplete_result") val incompleteResult: Boolean,
        val items: Array<SearchResult>
)