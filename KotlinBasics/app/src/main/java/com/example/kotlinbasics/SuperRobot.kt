package com.example.kotlinbasics

class SuperRobot(name: String) : GeneralRobot(name){


    fun cleanHouse() {
        println("The robot is cleaning the house")
    }

    override fun start() {
        println("Starting super robot")
    }

    override fun stop() {
        println("Stop super robot")
    }


}