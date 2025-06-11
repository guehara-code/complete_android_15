package com.example.kotlinviewmodelapp

import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel: ViewModel() {

    var counter = MutableLiveData<Int>()

    init {
        counter.value = 0
    }

    fun incrementCounter(view: View) {
        counter.value = (counter.value)?.plus(1)
    }

//    fun getCurrentCounter(): Int {
//        return counter
//    }
}