import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    val command = arrayOfNulls<String>(4)
    var i = 0

    do {
        for (item in scan.next().split(" ")) {
            if (!item.toBoolean()) {
                command[i] = ""
            } else {
                command[i] = item
            }
            i++
        }
        i = 0

        println(command[0])

        when (command[0]) {
            "help" -> help()
            "add" -> add(command[1], command[2], command[3])
        }

    } while (command[0] != "exit")

    scan.close()

}

fun help() {
    println("Help")
}

fun add(name: String?, connection: String?, phone: String?): String {
    println("Add")
    val phoneCheck: String
    val nameCheck: String

    fun String.onlyLetters() = all { it.isLetter() }

    if (name!!.onlyLetters()) {
        nameCheck = name
    } else {
        nameCheck = "error:$name"
    }

    when (connection) {
        "phone" -> phoneCheck = checkingPhone(phone?: "")
        else -> phoneCheck = name
    }

    return "$nameCheck $connection $phoneCheck"
}

fun checkingPhone(phone: String): String {
    for (i in 1 until phone.length) {
        if (!phone[i].isDigit()) {
            return "error:$phone"
        }

        if (phone[0] != '+' && !phone[0].isDigit()) {
            return "error:$phone"
        }
    }

    return phone
}
