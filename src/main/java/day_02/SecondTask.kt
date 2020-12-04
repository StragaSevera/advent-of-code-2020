package ru.ought.advent_of_code.day_02

import utils.resourceToString

object SecondTask {
    fun calculate(input: String): Int {
        val data = prepareData(input)
        return calculateResult(data)
    }

    private data class PasswordData(val first: Int, val second: Int, val letter: Char, val password: String)

    private val regexp = """(\d+)-(\d+) ([a-z]): ([a-z]+)""".toRegex()
    private fun prepareData(input: String): List<PasswordData> = input.split("\n").map { row ->
        val matchData = regexp.matchEntire(row)?.groupValues ?: error("Malformed data row: $row!")
        PasswordData(matchData[1].toInt(), matchData[2].toInt(), matchData[3][0], matchData[4])
    }

    private fun calculateResult(data: List<PasswordData>): Int = data.count { row ->
        if (row.first > row.password.length || row.second > row.password.length) false
        else (row.password[row.first - 1] == row.letter) xor (row.password[row.second - 1] == row.letter)
    }
}

fun main() {
    val input = resourceToString("day_02", "Task")
    val result = SecondTask.calculate(input)
    println()
    println("======")
    println("Result: $result")
}