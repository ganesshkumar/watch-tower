package com.ganesshkumar.watchtower.models

import com.google.gson.annotations.SerializedName

data class SearchResult (
        val name: String,
        val path: String,
        val sha: String,
        val url: String,
        @SerializedName("git_url") val gitUrl: String,
        @SerializedName("html_url") val htmlUrl: String,
        val repository: Repository,
        val score: Float
)