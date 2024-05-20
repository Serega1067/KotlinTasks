import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    val a: Int = scan.nextInt()
    val b: Int = scan.nextInt()
    val c: Int = scan.nextInt()

    for (i in 0..b) {
        for (j in 0 until a + c * i) {
            print('*')
        }
        println()
    }

    for (i in b - 1 downTo 0) {
        for (j in 0 until a + c * i) {
            print('*')
        }
        println()
    }
}
