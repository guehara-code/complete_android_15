package com.example.kotlinexercises

import java.util.Scanner

fun main() {

    var s1 = Scanner(System.`in`)

    print("enter the 1st number ")
    var x = s1.nextInt()

    print("enter the 2st number ")
    var y = s1.nextInt()

    print("enter the 3st number ")
    var z = s1.nextInt()

    if (x > y) {
        if (x > z) {
            print("$x is the greatest")
        }
    }

    if (y > x) {
        if (y > z) {
            print("$y is the greatest")
        }
    }

    if (z > x) {
        if (z > y) {
            print("$z is the greatest")
        }
    }
}