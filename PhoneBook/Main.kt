fun inputData(): List<String> {
    val arrayCommands = readln().split(' ')
    return arrayCommands
}

fun checkingCommand(command: List<String>): List<String> {
    if (command[0] == "add") {
        checkingAddCommand(command)
    }
}

fun checkingAddCommand(command: List<String>) {
    val result = Array(4, {"null"})
    result[0] = "add"
    if (command[1] == "phone") {
        checkingPhone()
    }
}

fun executingCommands(command: List<String>): List<String> {
    when (command[0]) {
        "exit" -> println("The program is over")
        "add" -> println("${command[1]} ${command[2]} ${command[3]}")
        "help" -> println("""
                             add - adding data
                             help - help
                             exit - exit the program
                          """.trimIndent())
        else -> println("Error")
    }
    return command
}

fun main() {
    do {
        val arrayCommands = executingCommands(inputData())
        println(arrayCommands.joinToString())
        println(arrayCommands::class.simpleName)
    } while (arrayCommands[0] != "exit")
}
