import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    val command = arrayOfNulls<String>(4)
    var i = 0

    do {
        for (item in scan.next().split(" ")) {
            if (item.toBoolean()) {
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

fun add(name: String, connection: String, phone: String) {
    println("Add")
    when (connection) {
        "phone" -> if(!checkingPhone(connection)) {
            println("Error phone")
            return false
        }
    }
}

fun checkingPhone(phone: String): Boolean {
    for (i in 0 until phone.length) {
        if (phone[0] != "+" || phone[0].isDigit()) {
            return false
        }
    }
}
