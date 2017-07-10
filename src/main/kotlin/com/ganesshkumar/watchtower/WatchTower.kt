package com.ganesshkumar.watchtower

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class WatchTower

fun main(args: Array<String>) {
    println("Hello World")

    // github.usersrepo("ganesshkumar").toList().forEach { println("${it.name} ${it.owner.login} ") }
    // github.searchCode("secret in:file user:ganesshkumar").items.map { it.htmlUrl } .forEach { println(it) }

    SpringApplication.run(WatchTower::class.java, *args)
}