package com.example.kotlinexercises

import java.util.Scanner

fun main() {

    var temp: Int

    print("Enter the 2 numbers: ")
    var s1 = Scanner(System.`in`)

    var a = s1.nextInt()
    var b = s1.nextInt()

    temp = a
    a = b
    b = temp

    print("The value of a: $a and b: $b")

}