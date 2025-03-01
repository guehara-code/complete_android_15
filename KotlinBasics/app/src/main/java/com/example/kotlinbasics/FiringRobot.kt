package com.example.kotlinbasics

class FiringRobot : GeneralRobot {

    constructor(name: String, modelYear: String): super(name, modelYear)
    constructor(name: String): super(name)
    fun fire() {
        println("Firing...")
        serialNumber = "8888"
        println(serialNumber)
    }

    override fun start() {
        println("FiringRobot has started")
    }
}