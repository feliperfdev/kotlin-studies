package com.feliperfdev.study.entendendoasintaxe

class Task(var id: Int, var title: String, var checked: Boolean) {
    // constructors are set at class name declaration

    fun check() {
        checked = !checked
    }

}

fun main() {

    var tasks: List<Task> = mutableListOf()

    var id = 0

    while (id != 10) {
        tasks += Task(id, "Study Kotlin - $id", false)
        id ++
    }

    println(tasks.map { it.title })
    print(tasks.map { it.checked })

    for (task in tasks) {
        if (task.id % 2 == 0) {
            task.check()
        }
    }

    println()
    println()


    println(tasks.map { it.title })
    print(tasks.map { it.checked })

}