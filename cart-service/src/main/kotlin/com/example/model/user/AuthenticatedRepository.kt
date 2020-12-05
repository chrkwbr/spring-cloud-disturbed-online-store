package com.example.model.user

interface AuthenticatedRepository {
    fun getAuthenticated(): Authenticated?
}
