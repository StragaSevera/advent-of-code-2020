package day_02

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class SecondTaskTest : FunSpec({
    test("calculates correct answer") {
        val input = """
            1-3 a: abcde
            1-3 b: cdefg
            2-9 c: ccccccccc
        """.trimIndent()

        val result = SecondTask.calculate(input)

        result shouldBe 1
    }
})