fun main() {
    val item1 = readlnOrNull()?.single()
    val item2 = readlnOrNull()?.single()
    val item3 = readlnOrNull()?.single()
    val item4 = readlnOrNull()?.single()
    println("${item1?.isDigit()}")
    println("${item2?.isDigit()}")
    println("${item3?.isDigit()}")
    println("${item4?.isDigit()}")
}