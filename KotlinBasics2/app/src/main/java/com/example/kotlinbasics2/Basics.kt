package com.example.kotlinbasics2

fun main() {

    // Lambda expressions
    val add: (Int, Int) -> Int = {a, b -> a + b}
    val result = add(5, 3)
    println(result)

    // Lambda expressions with no return type
    val add2: (Int, Int) -> Unit = {a, b -> println(a + b)}
    add2(5, 5)

    // Lambda with no parameters but with return type
    val add3: () -> String = {"Welcome to our course"}
    println(add3.invoke())

    // Lambda with no parameters and no return type
    val add4: () -> Unit = {println("No parameters, no return value")}
    add4.invoke()

    // Direct use of lambda expressions
    println({a: Int, b: Int -> a * b} (4, 5))

}