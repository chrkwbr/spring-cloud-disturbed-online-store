package com.example.model.user

import java.io.Serializable
import java.time.LocalDateTime

class Authenticated(
        val id: Long,
        val username: String,
        val firstname: String,
        val lastname: String,
        val createdAt: LocalDateTime,
        val createdBy: String,
        val updatedAt: LocalDateTime,
        val updatedBy: String,
        val version: Long
): Serializable
