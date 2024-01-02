package com.feliperfdev.study.entendendoasintaxe

var kpopList = mutableListOf<String>("BLACKPINK", "MAMAMOO", "TWICE", "(G)-idle", "GIRLS GENERATION", "KEP1ER")

fun asyncFlow(): Sequence<String> = sequence {
    for (i in kpopList) {
        Thread.sleep(300)
        yield(i)
    }
}

fun main() {

    var response = asyncFlow()

    response.forEach { println(it) }

    kpopList.asSequence().forEach {
        Thread.sleep(300)
        println(it.lowercase())
    }
}