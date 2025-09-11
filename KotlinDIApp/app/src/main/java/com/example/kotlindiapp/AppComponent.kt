package com.example.kotlindiapp

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {

//    fun getCar(): Car
fun inject(car: Car)
}