package day_01

object FirstTask {
    fun calculate(input: String): Int {
        val data = prepareData(input)
        return calculateResult(data)
    }

    private fun prepareData(input: String): List<Int> = input.split("\n").map { it.toInt() }

    private fun calculateResult(data: List<Int>): Int {
        return data.uniquePairs().find { it.first + it.second == 2020 }?.run { first * second } ?: error("There are no valid items in a list!")
    }

    private fun <T> List<T>.uniquePairs() = sequence {
        for (i in indices) {
            for (j in (i + 1) until size) {
                yield(get(i) to get(j))
            }
        }
    }
}

