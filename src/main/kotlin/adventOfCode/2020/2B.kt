import adventOfCode.readLines

/**
 * @author Jaeguk Cho
 */

fun main() = println(
    readLines("2020_2").count {
        val (first, last) = it.substringBefore(' ').split('-').map { it.toInt() - 1 }
        val char = it.substringAfter(' ')[0]
        with(it.substringAfterLast(' ')) {
            (get(first) == char) xor (get(last) == char)
        }
    }
)