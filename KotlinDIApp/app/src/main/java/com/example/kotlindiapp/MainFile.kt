package com.example.kotlindiapp

fun main() {
//    val engine = Engine()
//
//    val car = Car(engine)
//
//    car.drive()

    val appComponent: AppComponent = DaggerAppComponent.create()

    val car: Car = appComponent.getCar()

    println(car.drive())
}