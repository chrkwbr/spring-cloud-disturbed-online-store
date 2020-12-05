package com.example.model.cart

import com.example.model.BaseEntity
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table
class CartEvent(
        @Id
        var id: Long? = null,
        val cartEventType: CartEventType,
        var userId: Long? = null,
        val productId: String,
        val quantity: Int
) : BaseEntity()
