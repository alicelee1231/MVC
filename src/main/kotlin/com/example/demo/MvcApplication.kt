package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication class MvcApplication

fun main(args: Array<String>) {
    runApplication<MvcApplication>(*args)
}
