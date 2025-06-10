package com.example.kotlinquadraticeqsolver

import androidx.lifecycle.ViewModel

class CounterViewModel: ViewModel() {

    private var counter = 0

    fun incrementCounter() {
        counter++
    }

    fun getCurrentCounter(): Int {
        return counter
    }
}