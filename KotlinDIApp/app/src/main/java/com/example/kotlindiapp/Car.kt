package com.example.kotlindiapp

import javax.inject.Inject

class Car {

    // Dependency is created inside the class
//    private val engine = Engine()

//    @Inject
    lateinit var engine: Engine

    @Inject
    fun installEngine(engine: Engine) {
        this.engine = engine
    }

    fun drive() {
        println(engine.start())
    }
}