package com.example.model.cart

import org.springframework.data.repository.PagingAndSortingRepository

interface CartEventRepository: PagingAndSortingRepository<CartEvent, Long>
