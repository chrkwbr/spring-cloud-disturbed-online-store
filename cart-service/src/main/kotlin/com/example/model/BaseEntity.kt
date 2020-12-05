package com.example.model

import org.springframework.data.annotation.CreatedBy
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedBy
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.annotation.Version
import org.springframework.data.relational.core.mapping.Column
import java.time.LocalDateTime

open class BaseEntity {
    @Column("created_at")
    @CreatedDate
    var createdAt: LocalDateTime? = null

    @Column("created_by")
    @CreatedBy
    var createdBy: String? = null

    @Column("updated_at")
    @LastModifiedDate
    var updatedAt: LocalDateTime? = null

    @Column("updated_by")
    @LastModifiedBy
    var updatedBy: String? = null

    @Column("version")
    @Version
    var version: Long? = null
}
