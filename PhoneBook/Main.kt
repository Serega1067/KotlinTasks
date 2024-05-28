fun receivingAndVerifyingData(): List<String> {
    val arrayCommands = readln().split(' ')
    return arrayCommands
}

fun main() {
    do {
        val arrayCommands = receivingAndVerifyingData()
        println(arrayCommands.joinToString())
        println(arrayCommands::class.simpleName)
    } while (arrayCommands[0] != "exit")
}
