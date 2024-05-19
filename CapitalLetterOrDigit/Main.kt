fun main() {
    val ch: Char = readln().single()
    println(ch.isDigit() && ch != '0' || ch.isUpperCase())
}
