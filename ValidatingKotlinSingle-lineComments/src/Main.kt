import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    // Read the user's comment from input
    val comment = scanner.nextLine()

    // Check if the comment is a valid single-line comment
    val result: String

    if (comment.take(3) == "// ") {
        result = "Valid"
    } else {
        result = "Invalid"
    }

    // Print the result
    println(result)
}