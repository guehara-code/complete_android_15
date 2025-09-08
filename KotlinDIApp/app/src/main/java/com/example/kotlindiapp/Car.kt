package com.example.kotlindiapp

class Car(private val engine: Engine) {

    // Dependency is created inside the class
//    private val engine = Engine()

    fun drive() {
        println(engine.start())
    }
}