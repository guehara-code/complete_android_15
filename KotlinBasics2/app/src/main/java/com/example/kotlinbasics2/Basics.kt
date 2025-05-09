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


    // Anonymous function
    val number = listOf(1,2,3,4,5)

    val squareAnonymousFunction = fun(x: Int): Int{
        return x * x
    }

    val squaredNumbers = number.map(squareAnonymousFunction)

    println(squaredNumbers)

    // Anonymous function with parameters and return value
    val multiply = fun(a: Int, b: Int): Int{return a * b}
    println(multiply.invoke(6, 6))

    // Anonymous function with parameters and no return value
    val multiply2 = fun(a: Int, b: Int) { println("" + a * b)}
    multiply2(4, 5)

    // Anonymous function with no parameters and with return value
    val msg = fun(): String{return "Welcome to our course!"}
    println(msg())

    // Anonymous function with no parameters and no return value
    val msg2 = fun(): Unit{println("Welcome Again")}
    msg2()

    // Higher order function
    val addResult = operateOnNumbers(5, 3){x, y -> x + y}
    val multiplyResult = operateOnNumbers(5, 3) {x, y -> x * y}

    println("Addition Result: $addResult")
    println("Multiplication Result: $multiplyResult")

    // Using "it" keyword
    val numbers = listOf(1, 2, 3, 4, 5)
    val squaredNumbers2 = numbers.map{it * it}
    println(squaredNumbers2)


}

// Higher order function
fun operateOnNumbers(a: Int, b: Int, operation:(Int, Int) -> Int): Int {
    return operation(a, b)
}