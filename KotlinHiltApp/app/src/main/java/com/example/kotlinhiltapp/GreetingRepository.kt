package com.example.kotlinhiltapp

import javax.inject.Inject

class GreetingRepository @Inject constructor(){

    fun sayHello(): String {
        return "Hello From Hilt"
    }
}