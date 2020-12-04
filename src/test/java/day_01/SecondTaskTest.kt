package ru.ought.advent_of_code.day_01

import day_01.SecondTask
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class SecondTaskTest : FunSpec({
    test("calculates correct answer") {
        val input = """
            1721
            979
            366
            299
            675
            1456
        """.trimIndent()

        val result = SecondTask.calculate(input)

        result shouldBe 241861950
    }

    test("throws if no correct answer") {
        val input = """
            366
            675
            1456
        """.trimIndent()

        val result = { SecondTask.calculate(input) }

        shouldThrow<IllegalStateException>(result)
    }
})