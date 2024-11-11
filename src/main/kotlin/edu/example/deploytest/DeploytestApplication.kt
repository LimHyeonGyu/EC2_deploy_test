package edu.example.deploytest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DeploytestApplication

fun main(args: Array<String>) {
    runApplication<DeploytestApplication>(*args)
}
