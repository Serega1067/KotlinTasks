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
        result[2] = command[2]
        result[3] = checkingEmail(command[3])
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

fun checkingEmail(email: String): String {
    if ('@' !in email) {
        return "ErrorNot'@'"
    }

    if ('.' !in email) {
        return "ErrorNot'.'"
    }

    if (email.count { it == '@' } > 1) {
        return "TheErrorIsALotOf'@'"
    }

    if (email.count { it == '.' } > 1) {
        return "TheErrorIsALotOf'.'"
    }

    val emailStep1 = email.split('@')
    val emailStep2 = emailStep1[1].split('.')
    val emailStep3 = arrayOf(emailStep1[0], emailStep2[0], emailStep2[1])

    fun String.onlyLetters() = all { it.isLetter() }

    for (item in emailStep3) {
        if (!item.onlyLetters()) {
            return "Error${item}"
        }
    }

    return email
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
        println(arrayCommands[1])
    } while (arrayCommands[0] != "exit")
}
