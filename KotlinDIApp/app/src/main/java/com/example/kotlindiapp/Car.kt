package com.example.kotlindiapp

import javax.inject.Inject

class Car {

    // Dependency is created inside the class
//    private val engine = Engine()

    @Inject
    lateinit var engine: Engine

    fun drive() {
        println(engine.start())
    }
}