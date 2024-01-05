package com.feliperfdev.study.entendendoasintaxe

import kotlin.math.sin


fun main() {
    var numbers: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    // In Kotlin, we type variables using ':' after the name

    var evenNumbers: List<Int> = numbers.filter { it % 2 == 0 }
    var oddNumbers: List<Int> = numbers.filter { it % 2 != 0 }
    // Comparing with Dart, where we have: list.where((e) => e % 2 == 0);
    // in Kotlin we do not need to use an arrow function to get a list element, we just need to use the key `it`

    // Read about lambda expression syntax: https://kotlinlang.org/docs/lambdas.html#lambda-expression-syntax

    println("Even numbers:")
    for (number: Int in evenNumbers) {
        print("$number ") // Same Dart string interpolation by parsing variables into a `$` to get their values
    }
    println()

    println("Odd numbers:")
    for (number: Int in oddNumbers) {
        print("$number ")
    }

    /*
     val constantValue = 0;

    constantValue = 2;

    The keyword `val` is used to assign constant values, so they cannot be replaced by other values
    */

    var sum = 0
    while (sum < 10) {
        for (number: Int in numbers) {
            sum += number
        }
    }
    println()
    print("Sum: $sum")

    // ===================================================================================================

    println()
    println()
    var pokemonList = mutableListOf<String>("Infernape", "Sylveon", "Greninja", "Tsareena", "Hydreagon", "Luxray")

    for (pokemon: String in pokemonList) {
        if (!pokemon.contains('a')) {
            print("$pokemon 🌸")
            println()
        } else {
            println(pokemon.uppercase())
        }
    }

    // ===================================================================================================

    println()
    println()

    var numberList = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    var sinList = numberList.map { sin(it.toDouble()) }.toList()
    for (sin: Double in sinList) {
        println(sin)
    }

    println()
    println()

    var sinFiltered = sinList.filter { sinValue -> sinValue > 0 }
    sinFiltered.forEach { println(it) }

}