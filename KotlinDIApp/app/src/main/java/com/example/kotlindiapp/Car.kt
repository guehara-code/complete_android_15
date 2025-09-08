package com.example.kotlindiapp

class Car {

    // Dependency is created inside the class
    private val engine = Engine()

    fun drive() {
        println(engine.start())
    }
}