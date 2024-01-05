package com.feliperfdev.study.entendendoasintaxe

fun fatorial(x: Int): Int {
    return if (x <= 1) 1 else x * fatorial(x-1)
}

fun fibonacci(x: Int): Int {
    return if (x <= 1) x else fibonacci(x-1) + fibonacci(x-2)
}
fun main() {
    println(fatorial(6))
    println(fibonacci(8))
}