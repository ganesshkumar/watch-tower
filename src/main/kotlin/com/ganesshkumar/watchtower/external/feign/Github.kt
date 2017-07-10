package com.ganesshkumar.watchtower.external.feign

import feign.Feign
import feign.RequestInterceptor
import feign.RequestTemplate
import feign.gson.GsonDecoder
import feign.gson.GsonEncoder
import org.springframework.stereotype.Component
import org.springframework.core.env.Environment

@Component
class Github(githubFeignInterceptor: GithubFeignInterceptor) {

    private val client = Feign.builder()
            .encoder(GsonEncoder())
            .decoder(GsonDecoder())
            .requestInterceptor(githubFeignInterceptor)
            .target(GitHubFeign::class.java, "https://api.github.com")

    fun userRepos(login: String) = client.usersrepo(login)

    fun searchCode(query: String) = client.searchCode(query)
}

@Component
class GithubFeignInterceptor(val env: Environment): RequestInterceptor {
    override fun apply(template: RequestTemplate?) {
        template?.header("User-Agent", env.getProperty("github.appname"))
        template?.query("client_id", env.getProperty("github.clientid"))
        template?.query("client_secret", env.getProperty("github.clientsecret"))
    }
}