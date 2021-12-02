package day02

import readInput

fun main() {
    fun part1(input: List<String>): Int {
        var (horizontal, vertical) = Pair(0, 0)
        input.map { it.split(" ") }
            .forEach {
                val distance = it[1].toInt()
                when (it[0].lowercase()) {
                    "forward" -> horizontal += distance
                    "down" -> vertical += distance
                    "up" -> vertical -= distance
                }
            }
        return horizontal * vertical
    }

    fun part2(input: List<String>): Int {
        var (horizontal, vertical, aim) = Triple(0, 0, 0)
        input.map { it.split(" ") }
            .forEach {
                val distance = it[1].toInt()
                when (it[0].lowercase()) {
                    "forward" -> {
                        horizontal += distance
                        vertical += aim * distance
                    }
                    "down" -> aim += distance
                    "up" -> aim -= distance
                }
            }
        return horizontal * vertical
    }

    val input = readInput("day02", "Day02")

    println(part1(input))
    println(part2(input))
}
