package com.example.model.user

import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.repository.query.Param
import reactor.core.publisher.Mono

interface UserRepository: PagingAndSortingRepository<User, Long> {
    fun findByUsername(@Param("username") username: String): Mono<User>
}
