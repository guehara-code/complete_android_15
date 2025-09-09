package com.example.kotlindiapp

import javax.inject.Inject

class Car @Inject constructor(private val engine: Engine) {

    // Dependency is created inside the class
//    private val engine = Engine()

    fun drive() {
        println(engine.start())
    }
}