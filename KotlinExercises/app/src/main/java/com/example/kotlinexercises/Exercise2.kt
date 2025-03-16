package com.example.kotlinexercises

import java.util.Scanner

fun main() {

    var s1 = Scanner(System.`in`)

    print("Please enter the radius ")
    var radius = s1.nextInt()

    var peri: Double = 2 * 3.1415 * radius
    var area: Double = radius * radius * 3.1415

    print("The area: $area, the perimeter: $peri")
}