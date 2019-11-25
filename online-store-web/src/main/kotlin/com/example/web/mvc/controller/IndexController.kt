package com.example.web.mvc.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class IndexController {
    @GetMapping("/")
    fun index() = "hello Spring Kotlin Vue"
}