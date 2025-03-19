package com.example.kotlinexercises

import java.util.Scanner

fun main() {

    var s1 = Scanner(System.`in`)
    print("Enter a string \n")

    var letters = s1.nextLine().toCharArray()

    var reverse = ""
    print("Reversed string: \n")
    for(i in letters.size - 1 downTo 0) {
        reverse += letters[i]
    }

    print(reverse)
}