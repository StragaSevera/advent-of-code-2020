package ru.ought.advent_of_code.day_01

import utils.resourceToString

object SecondTask {
    fun calculate(input: String): Int {
        val data = prepareData(input)
        return calculateResult(data)
    }

    private fun prepareData(input: String): List<Int> = input.split("\n").map { it.toInt() }

    private fun calculateResult(data: List<Int>): Int {
        return data.uniqueTriples().find { it.first + it.second + it.third == 2020 }?.run { first * second * third }
            ?: error("There are no valid items in a list!")
    }

    private fun <T> List<T>.uniqueTriples() = sequence {
        for (i in indices) {
            for (j in (i + 1) until size) {
                for (k in (j + 1) until size) {
                    yield(Triple(get(i), get(j), get(k)))
                }
            }
        }
    }
}

fun main() {
    val input = resourceToString("day_01", "Task")
    val result = SecondTask.calculate(input)
    println()
    println("======")
    println("Result: $result")
}