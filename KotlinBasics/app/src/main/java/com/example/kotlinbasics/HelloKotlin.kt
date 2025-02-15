package com.example.kotlinbasics

fun main() {

    // Mutable variable
    var myAge : Int = 25

    // Immutable variable
    val pi : Double = 3.14159

    println("My age is: " + myAge)


    // Byte: -128 tp 127
    val myByte : Byte = 127

    // Short: -32786 to 32767
    val myShort : Short = 5473

    // Int: approx. -2 billion to 2 billion
    val myInt : Int = 475638

    // Long
    val myLong : Long = 6541681351

    // Float : decimal numbers
    val myFloat : Float = 3.14159f


    // Double : decimals with double precision
    val myDouble : Double = 2.75135654

    // Boolean : True or False
    val isRaining : Boolean = true

    if (isRaining) {
        println("It is raining outside")
    }

    // Characters: represents characters
    // letters, digits, symbols or special characters
    var myChar : Char = '\n'

    // Arithmetic Operators: +-*/%

    var result: Int = 5 + 3
    println("The result = " + result)

    result = 5 - 3
    println("The result = " + result)

    result = 5 * 3
    println("The result = " + result)

    result = 6 / 3
    println("The result = " + result)

    result = 5 % 3     // remainder or division
    println("The result = " + result)

    // Logical Operators: && || !
    var result2 : Boolean = true && true
    println("The result2 = " + result2)

    result2 = true || false
    println("The result2 = " + result2)

    result2 = !true
    println("The result2 = " + result2)

}