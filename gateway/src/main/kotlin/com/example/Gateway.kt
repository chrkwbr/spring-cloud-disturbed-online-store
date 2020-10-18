package com.example

import com.example.accesslog.AccessLoggingGatewayFilterFactory
import com.example.security.SecurityConfig
import io.micrometer.core.instrument.config.MeterFilter
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.cloud.netflix.hystrix.EnableHystrix
import org.springframework.context.ApplicationContextInitializer
import org.springframework.context.support.GenericApplicationContext
import org.springframework.context.support.beans
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer

@EnableResourceServer
@EnableHystrix // TODO use resilience4j
@EnableEurekaClient
@SpringBootApplication
class Gateway

val beans = beans {
    bean<AccessLoggingGatewayFilterFactory>()
    bean<SecurityConfig>()
    bean("meterFilter") {
        MeterFilter.deny {
            it.getTag("uri")?.startsWith("/actuator") ?: false
        }
    }
}

class BeansInitializer : ApplicationContextInitializer<GenericApplicationContext> {
    override fun initialize(applicationContext: GenericApplicationContext) = beans.initialize(applicationContext)
}

fun main(args: Array<String>) {
    SpringApplicationBuilder()
            .sources(Gateway::class.java)
            .initializers(BeansInitializer())
            .run(*args)
}
