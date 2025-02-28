package com.example.kotlinbasics

open class GeneralRobot {

    private var serialNumber: String = "12345"

    var name: String
    var modelYear: String = ""
        // Getters and Setters
        get() {
            println("Getting the model year, please wait... ")
            return field
        }

        set(value) {
            println("Changing the model year, please wait,,, ")
            if (value.equals("2025")) {
                println("You can't create future robots")
            } else {
                field = value
            }
        }


    // init block: to execute code in the object creation

    init {
        name = ""
        modelYear = ""
        println("A new robot is created")
    }

    // Primary constructor
    constructor(name: String, modelYear: String) {
        this.name = name
        this.modelYear = modelYear
    }

    // Secondary constructor
    constructor(name: String) {
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