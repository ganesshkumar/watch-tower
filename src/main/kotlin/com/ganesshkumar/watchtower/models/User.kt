package com.ganesshkumar.watchtower.models

import com.google.gson.annotations.SerializedName

enum class UserType {
    User,
    Organization
}

data class User (
        val login: String,
        val id: Long,
        @SerializedName("avatar_url") val avatarUrl: String,
        @SerializedName("gravatar_id") val gravatarId: String,
        val url: String,
        @SerializedName("html_url") val htmlUrl: String,
        @SerializedName("followers_url") val followersUrl: String,
        @SerializedName("following_url") val followingUrl: String,
        @SerializedName("gists_url") val gistsUrl: String,
        @SerializedName("starred_url") val starredUrl: String,
        @SerializedName("subscriptions_url") val subscriptionsUrl: String,
        @SerializedName("organizations_url") val organizationsUrl: String,
        @SerializedName("repos_url") val reposUrl: String,
        @SerializedName("events_url") val eventsUrl: String,
        @SerializedName("reveived_events_url") val receivedEventsUrl: String,
        val type: UserType,
        @SerializedName("site_admin") val siteAdmin: Boolean
)