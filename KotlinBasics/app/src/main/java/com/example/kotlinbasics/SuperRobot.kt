package com.example.kotlinbasics

class SuperRobot(name: String) : GeneralRobot(name){


    fun cleanHouse() {
        println("The robot is cleaning the house")
    }

    override fun start() {
        println("SuperRobot has started")
    }


}