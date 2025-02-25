package com.example.kotlinbasics

open class GeneralRobot( val name: String) {
    fun walk() {
        println("The robot is walking now...")
    }

    fun speak(message: String) {
        println("$name says: $message")
    }
}