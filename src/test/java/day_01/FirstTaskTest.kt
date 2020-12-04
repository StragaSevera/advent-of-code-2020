package ru.ought.advent_of_code.day_01

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class FirstTaskTest : FunSpec({
    test("calculates correct answer") {
        val input = """
            1721
            979
            366
            299
            675
            1456
        """.trimIndent()

        val result = FirstTask.calculate(input)

        result shouldBe 514579
    }

    test("throws if no correct answer") {
        val input = """
            979
            366
            299
            675
            1456
        """.trimIndent()

        val result = { FirstTask.calculate(input) }

        shouldThrow<IllegalStateException>(result)
    }
})