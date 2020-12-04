package ru.ought.advent_of_code.day_02

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class FirstTaskTest : FunSpec({
    test("calculates correct answer") {
        val input = """
            1-3 a: abcde
            1-3 b: cdefg
            2-9 c: ccccccccc
        """.trimIndent()

        val result = FirstTask.calculate(input)

        result shouldBe 2
    }
})