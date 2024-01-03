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
    response.forEach {group -> println(group) } // an other way to use named param like `it`
    // same from dart: list.map((group) => print(group));

    kpopList.asSequence().forEach {kpopGroup ->
        Thread.sleep(300)
        println(kpopGroup.lowercase())
    }
}