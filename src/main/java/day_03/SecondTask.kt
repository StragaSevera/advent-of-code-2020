package ru.ought.advent_of_code.day_03

import utils.resourceToString

object SecondTask {
    fun calculate(input: String): Int {
        val data = prepareData(input)
        return calculateResult(data)
    }

    private fun prepareData(input: String): List<String> = input.split("\n")

    private data class Slope(val offsetX: Int, val offsetY: Int)

    private val SLOPES = listOf(
        Slope(1, 1), Slope(3, 1), Slope(5, 1),
        Slope(7, 1), Slope(1, 2)
    )

    private fun calculateResult(data: List<String>): Int {
        val list = SLOPES.map { calculateSlope(data, it) }
        return list.reduce(Int::times)
    }

    private const val TREE = '#'
    private fun calculateSlope(data: List<String>, slope: Slope): Int = data.withIndex().count { (i, row) ->
        if (i % slope.offsetY != 0) return@count false
        val x = (i / slope.offsetY * slope.offsetX) % row.length
        row[x] == TREE
    }
}

fun main() {
    val input = resourceToString("day_03", "Task")
    val result = SecondTask.calculate(input)
    println()
    println("======")
    println("Result: $result")
}