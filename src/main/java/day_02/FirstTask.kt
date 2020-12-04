package day_02

import utils.resourceToString

object FirstTask {
    fun calculate(input: String): Int {
        val data = prepareData(input)
        return calculateResult(data)
    }

    private data class PasswordData(val min: Int, val max: Int, val letter: Char, val password: String)

    private val regexp = """(\d+)-(\d+) ([a-z]): ([a-z]+)""".toRegex()
    private fun prepareData(input: String): List<PasswordData> = input.split("\n").map { row ->
        val matchData = regexp.matchEntire(row)?.groupValues ?: error("Malformed data row: $row!")
        PasswordData(matchData[1].toInt(), matchData[2].toInt(), matchData[3][0], matchData[4])
    }

    private fun calculateResult(data: List<PasswordData>): Int = data.count { row ->
        row.password.count {it == row.letter} in row.min..row.max
    }
}

fun main() {
    val input = resourceToString("day_02", "Task")
    val result = FirstTask.calculate(input)
    println()
    println("======")
    println("Result: $result")
}