package com.example

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer

@SpringBootApplication
//@EnableJpaRepositories
//@EnableJpaAuditing
//@EnableEurekaClient
@EnableResourceServer
//@EnableOAuth2Client
//@EnableHystrix
class CartApplication

fun main(args: Array<String>) {
    SpringApplication.run(CartApplication::class.java, *args)
}
