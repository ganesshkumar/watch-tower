package com.ganesshkumar.watchtower.web.routes

import com.ganesshkumar.watchtower.web.handlers.PagesHandler
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.server.router

@Configuration
class Routes() {
    @Bean
    fun pagesRouter(pagesHandler: PagesHandler) = router {
        GET("/", pagesHandler::welcome)
    }
}