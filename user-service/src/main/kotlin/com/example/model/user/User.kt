package com.example.model.user

import com.example.model.BaseEntity
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column

data class User(
        @Id
        @Column("id")
        var id: Long? = null,

        @Column("username")
        var username: String? = null,

        @Column("firstName")
        var firstName: String? = null,

        @Column("lastName")
        var lastName: String? = null,

        @Column("email")
        var email: String? = null
) : BaseEntity()
