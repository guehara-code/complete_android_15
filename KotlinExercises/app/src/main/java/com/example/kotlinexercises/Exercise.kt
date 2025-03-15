package com.example.kotlinexercises

import java.util.Scanner


fun main() {

    var s1 = Scanner(System.`in`)
    print("Please enter a number ")

    var x = s1.nextInt()
    print("Please enter a number ")
    var y = s1.nextInt()

    var div_result = x / y
    var remainder = x % y

    print("The result = $div_result and the remainder is $remainder")


}