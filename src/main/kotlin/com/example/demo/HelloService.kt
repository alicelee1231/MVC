package com.example.demo

import org.springframework.stereotype.Service

@Service
class HelloService(private val helloRepository: HelloRepository) {
    
    fun getHelloMessage(): String {
        return "Hello, User!"
    }

    fun createHello(helloRequest: HelloRequest): HelloEntity {
        val helloUser = HelloEntity(name = helloRequest.name, age = helloRequest.age)
        return helloRepository.save(helloUser)
    }
}