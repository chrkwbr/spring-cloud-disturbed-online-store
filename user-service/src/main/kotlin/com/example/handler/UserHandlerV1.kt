package com.example.handler

import com.example.model.user.User
import com.example.model.user.UserRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class UserHandlerV1(private val userRepository: UserRepository) {
    fun getUserByUsername(username: String): Mono<User> = userRepository.findByUsername(username)
}
