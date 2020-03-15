package com.example

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.cloud.netflix.hystrix.EnableHystrix
import org.springframework.data.jpa.repository.config.EnableJpaAuditing
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.data.rest.core.config.RepositoryRestConfiguration
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter
import org.springframework.stereotype.Component

@SpringBootApplication
@EnableJpaAuditing
@EnableJpaRepositories
@EnableEurekaClient
@EnableHystrix
class UserApplication {
    @Component
    class CustomRestMvcConfiguration : RepositoryRestConfigurerAdapter() {
        override fun configureRepositoryRestConfiguration(config: RepositoryRestConfiguration) {
            config.setBasePath("/api")
        }
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(UserApplication::class.java, *args)
}