package com.example.kotlinquadraticeqsolver

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.example.kotlinquadraticeqsolver.databinding.ActivityMainBinding

class MyEquation: BaseObservable() {

    @Bindable
    var a: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.a)
        }

    @Bindable
    var b: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.b)
        }

    @Bindable
    var c: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.c)
        }
    lateinit var binding: ActivityMainBinding
}