fun inputData(): List<String> {
    val arrayCommands = readln().split(' ')
    return arrayCommands
}

fun checkingCommand(command: List<String>): String {
    return checkingAddCommand(command)
}

fun checkingAddCommand(command: List<String>): String {
    val result = Array(4, {"null"})
    result[0] = "add"

    if (command.size > 1) {
        result[1] = command[1]
    }

    if (command.size > 2 && command[2] == "phone") {
        result[2] = command[2]
        result[3] = checkingPhone(command[3])
    }

    if (command.size > 2 && command[2] == "email") {
    }

    return "${result[1]} ${result[2]} ${result[3]}"
}

fun checkingPhone(phone: String): String {
    if (phone[0] == '+' || phone[0].isDigit()) {
        if (phone.slice(1 until phone.length).all { char -> char.isDigit() }) {
            return phone
        }
    }

    return "Errorphone" 
}

fun executingCommands(command: List<String>): Array<String> {
    lateinit var result: String
    when (command[0]) {
        "exit" -> result = "The program is over"
        "add" -> result = checkingCommand(command)
        "help" -> result = """
                              add - adding data
                              help - help
                              exit - exit the program
                           """.trimIndent()
        else -> result = "Error"
    }
    return arrayOf(command[0], result)
}

fun main() {
    do {
        val arrayCommands = executingCommands(inputData())
        println(arrayCommands.joinToString())
        println(arrayCommands::class.simpleName)
        println(arrayCommands[1])
    } while (arrayCommands[0] != "exit")
}
