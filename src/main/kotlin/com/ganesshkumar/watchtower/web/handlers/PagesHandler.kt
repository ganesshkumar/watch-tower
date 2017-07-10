package com.ganesshkumar.watchtower.web.handlers

import com.ganesshkumar.watchtower.external.feign.Github
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.BodyInserters.fromObject
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.ServerResponse.ok
import reactor.core.publisher.Mono

@Component
class PagesHandler(val github: Github) {
    fun welcome(serverRequest: ServerRequest): Mono<ServerResponse> {
        github.searchCode("secret in:file user:ganesshkumar").items.map { it.htmlUrl } .forEach { println(it) }
        return ok().body(fromObject("Hello, World!"))
    }
}