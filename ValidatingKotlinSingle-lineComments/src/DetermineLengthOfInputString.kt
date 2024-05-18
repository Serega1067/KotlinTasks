import java.util.Scanner

fun main () {
    val scanner: Scanner = Scanner(System.`in`)
    var input : String? = scanner.nextLine()

    if (input != null) {
        println(input.length)
    }
}