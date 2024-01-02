package com.feliperfdev.study.entendendoasintaxe


fun fatorial(x: Int): Int {
    if (x <= 1) return 1
    return x * fatorial(x-1)
}

fun fibonacci(x: Int): Int {
    if (x <= 1) return x
    return fibonacci(x-1) + fibonacci(x-2)
}
fun main() {
    println(fatorial(6))
    println(fibonacci(8))
}