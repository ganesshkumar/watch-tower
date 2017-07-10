package com.ganesshkumar.watchtower.external.feign

import com.ganesshkumar.watchtower.models.Repository
import com.ganesshkumar.watchtower.models.SearchResponse
import feign.Param
import feign.RequestLine

internal interface GitHubFeign {
    @RequestLine("GET /users/{owner}/repos")
    fun usersrepo(@Param("owner") owner: String): Array<Repository>

    @RequestLine("GET /search/code?q={search}")
    fun searchCode(@Param("search") search: String): SearchResponse
}
