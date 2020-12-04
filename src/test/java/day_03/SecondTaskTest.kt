package ru.ought.advent_of_code.day_03

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class SecondTaskTest : FunSpec({
    test("calculates correct answer") {
        val input = """
            ..##.......
            #...#...#..
            .#....#..#.
            ..#.#...#.#
            .#...##..#.
            ..#.##.....
            .#.#.#....#
            .#........#
            #.##...#...
            #...##....#
            .#..#...#.#
        """.trimIndent()

        val result = SecondTask.calculate(input)

        result shouldBe 336
    }
})