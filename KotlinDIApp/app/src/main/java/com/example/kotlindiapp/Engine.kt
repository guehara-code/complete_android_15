package com.example.kotlindiapp

import javax.inject.Inject

class Engine @Inject constructor() {

    fun start() = "Engine Started"
}