package com.example.api.v1.user

import com.example.handler.UserHandlerV1
import com.example.model.user.User
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono
import java.security.Principal

@RestController
@RequestMapping("/v1")
class UserController(private val userHandlerV1: UserHandlerV1) {

    @RequestMapping(path = ["/me"])
    fun me(principal: Principal?): Mono<User> {
        return principal?.let {
            userHandlerV1.getUserByUsername(it.name)
        } ?: throw UsernameNotFoundException("Username not found")
    }
}
