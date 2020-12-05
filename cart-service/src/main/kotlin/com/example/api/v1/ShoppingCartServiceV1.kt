package com.example.api.v1

import com.example.model.cart.CartEvent
import com.example.model.user.AuthenticatedRepository
import com.example.model.cart.CartEventRepository
import org.springframework.stereotype.Service

@Service
class ShoppingCartServiceV1(
        private val authenticatedRepository: AuthenticatedRepository,
        private val cartEventRepository: CartEventRepository) {
    fun addCartEvent(cartEvent: CartEvent): Boolean? {
        val authenticated = authenticatedRepository.getAuthenticated()
        return authenticated?.let {
            cartEvent.userId = authenticated.id
            cartEventRepository.save(cartEvent)
            true
        }
    }
}
