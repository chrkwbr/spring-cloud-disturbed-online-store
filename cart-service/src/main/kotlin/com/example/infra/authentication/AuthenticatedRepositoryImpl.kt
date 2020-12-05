package com.example.infra.authentication

import com.example.model.user.Authenticated
import com.example.model.user.AuthenticatedRepository
import org.springframework.stereotype.Repository

@Repository
class AuthenticatedRepositoryImpl: AuthenticatedRepository {
    override fun getAuthenticated(): Authenticated? {
        TODO("Not yet implemented")
    }
}
