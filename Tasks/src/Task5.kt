import java.util.Scanner

val scanner = Scanner(System.`in`)

fun readInput(): String {
    return scanner.nextLine()
}

fun evaluateCommand(input: String): Boolean {
    return input == "RUN silent"

    throw NotImplementedError("Not implemented yet!")
}

fun main() {
    val command = readInput()
    val result = evaluateCommand(command)
    println(result)
}