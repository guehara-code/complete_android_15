package com.example.kotlinbasics2

fun main() {

    // Lambda expressions
    val add: (Int, Int) -> Int = {a, b -> a + b}
    val result = add(5, 3)
    println(result)

    // Lambda expressions with no return type
    val add2: (Int, Int) -> Unit = {a, b -> print(a + b)}
    add2(5, 5)

}