package ru.ought.advent_of_code.day_03

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class FirstTaskTest : FunSpec({
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

        val result = FirstTask.calculate(input)

        result shouldBe 7
    }
})