package com.example.kotlinbasics

class OrdinaryRobot(name: String) : GeneralRobot(name){

    fun turnOnLight() {
        println("The light is on")
    }

    override fun start() {
        println("Starting ordinary robot")
    }

    override fun stop() {
        println("Stop ordinary robot")
    }
}