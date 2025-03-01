package com.example.kotlinbasics

class OrdinaryRobot(name: String) : GeneralRobot(name){

    fun turnOnLight() {
        println("The light is on")
    }

    override fun start() {
        println("OrdinaryRobot has started")
    }
}