package com.example.kotlinbasics

open class GeneralRobot() {

    var name: String
    var modelYear: String

    // init block: to execute code in the object creation

    init {
        name = ""
        modelYear = ""
        println("A new robot is created")
    }

    // Primary constructor
    constructor(name: String, modelYear: String) : this() {
        this.name = name
        this.modelYear = modelYear
    }

    // Secondary constructor
    constructor(name: String) : this() {
        this.name = name
        this.modelYear = "Unknown model year"
    }


    fun walk() {
        println("The robot is walking now...")
    }

    fun speak(message: String) {
        println("$name says: $message")
    }
}