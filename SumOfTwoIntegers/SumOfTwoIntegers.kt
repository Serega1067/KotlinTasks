import java.util.Scanner

fun main() {
    println("The sum of two integer")

    val scan = Scanner(System.`in`)

    println("Enter the first integer")
    val firstInt: Int = scan.nextInt()

    println("Enter the second integer")
    val secondInt: Int = scan.nextInt()

    println("Sum = ${firstInt + secondInt}")
}
