package day01

import readInput

fun main() {
    fun part1(input: Sequence<Int>): Int {
        return input.zipWithNext()
            .count { it.first < it.second }
    }

    fun part2(input: Sequence<Int>): Int {
        return part1(
            input.windowed(size = 3, step = 1)
                .map(List<Int>::sum)
        )
    }

    val input = readInput("day01", "Day01")
        .map(String::toInt)
        .asSequence()
    println(part1(input))
    println(part2(input))
}
