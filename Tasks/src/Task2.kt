import java.util.Scanner

fun main() {
    var result: Boolean = true
    val scan = Scanner(System.`in`)
    val ch: Char = scan.next().single()
    for (i in 1..2) {
        if (ch + i != scan.next().single()) {
            result = false
        }
    }
    println(result)
    println(ch)
    println(ch.code)
    println(ch)

    val number: Int = scan.nextInt()
    val newCh: Char = scan.next().single()
    scan.close()
    println(number == newCh.code)
}