package com.example.kotlinexercises

import java.util.Scanner

fun main() {

    var s1 = Scanner(System.`in`)
    print("Enter a string \n")

    var letters = s1.nextLine()

    var reverse = ""
    print("Reversed string: \n")
    reverse = letters.reversed()

    print(reverse)
}