package ru.ought.advent_of_code.day_03

import utils.resourceToString

object FirstTask {
    fun calculate(input: String): Int {
        val data = prepareData(input)
        return calculateResult(data)
    }

    private fun prepareData(input: String): List<String> = input.split("\n")

    private const val TREE = '#'
    private fun calculateResult(data: List<String>): Int = data.withIndex().count { (i, row) ->
        val x = (i * 3) % row.length
        row[x] == TREE
    }
}

fun main() {
    val input = resourceToString("day_03", "Task")
    val result = FirstTask.calculate(input)
    println()
    println("======")
    println("Result: $result")
}