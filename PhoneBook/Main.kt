import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    // val command: Array<String>
    // var i = 0

    do {
        val text = scan.next()
        val command = text.split(" ").toTypedArray()
        command.forEach {arg ->
            println(arg)
        }
        // for (item in scan.next().split(" ")) {
        //    command[i] = item
        //    i++
        // }
        // i = 0

        when (command[0]) {
            "help" -> println(help())
            "add" -> println(add(command[1], command[2], command[3]))
        }

    } while (command[0] != "exit")

    scan.close()

}

fun help(): String {
    return "Help"
}

fun add(name: String, connection: String, phone: String): String {
    val dataCheck: String
    val nameCheck: String
    println("$name, $connection, $phone")

    fun String.onlyLetters() = all { it.isLetter() }

    if (name.onlyLetters()) {
        nameCheck = name
    } else {
        nameCheck = "error:$name"
    }

    when (connection) {
        "phone" -> dataCheck = checkingPhone(phone)
        else -> dataCheck = "str"
    }
    println("$nameCheck $connection $dataCheck")

    return "$nameCheck $connection $dataCheck"
}

fun checkingPhone(phone: String): String {
    if (phone[0] != '+' && !phone[0].isDigit()) {
        return "error:$phone"
    }

    for (i in 1 until phone.length) {
        if (!phone[i].isDigit()) {
            return "error:$phone"
        }
    }

    return phone
}
