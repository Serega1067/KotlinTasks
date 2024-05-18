fun main(vararg args: String) {
    println("The sum of two integer")
    println("Enter two integers")

    if (args.size >= 2) {
        val num1 = args[0].toIntOrNull()
        val num2 = args[1].toIntOrNull()
        if (num1 != null && num2 != null) {
            println("Sum = ${num1 + num2}")
            return
        }
    }

    println("Error in arguments!")
}
