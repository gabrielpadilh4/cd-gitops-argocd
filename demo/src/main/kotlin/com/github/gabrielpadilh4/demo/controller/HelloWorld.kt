package com.github.gabrielpadilh4.demo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class HelloWorld {

    @GetMapping
    fun helloWorld(): String {
        return "Hello Argocd"
    }
}