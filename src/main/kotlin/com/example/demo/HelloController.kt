package com.example.demo

import org.springframework.web.bind.annotation.*
import org.springframework.http.ResponseEntity
import com.example.demo.HelloRequest


@RestController
@RequestMapping("/api")
class HelloController(private val helloService: HelloService) {

    @GetMapping("/hello/user")
    fun getHello(): String {
        return helloService.getHelloMessage()   
    }

    @PostMapping("/hello")
    fun postHello(@RequestBody request: HelloRequest): ResponseEntity<HelloEntity> {
        val savedHello = helloService.createHello(request)
        return ResponseEntity.ok(savedHello)
    }   
    
}
