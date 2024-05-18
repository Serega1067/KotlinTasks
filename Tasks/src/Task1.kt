import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val ch1: Char = scanner.next().single()
    val ch2: Char = scanner.next().single()
    println(ch1.lowercaseChar() == ch2.lowercaseChar())

    val c: Char = 'a'
    val n: Int = 3
    println(c + n)
    println(c - n)
}
