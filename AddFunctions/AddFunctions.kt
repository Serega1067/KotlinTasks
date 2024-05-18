fun main() {
    fun sumAll(vararg args: Int?): Int {
        var result = 0
        if (args.size == 0) {
            return 0
        }
        for (item in args) {
            result = result + when(item) {
                null -> 0
                else -> item
            }
        }
        return result
    }

    fun createOutputString(name: String, 
                           age: Int = 42, 
                           isStudent: Boolean? = false): String {
        if (isStudent?: false) {
            return "student $name has age of $age"
        } else {
            return "$name has age of $age"
        }
    }

    fun multiplyBy(number1: Int?, number2: Int): Int? {
        if (number1 == null) {
            return null
        }
        return number1 * number2
    }

    println("sumAll = ${sumAll(1, 5, 20)}")
    println("sumAll = ${sumAll()}")
    println("sumAll = ${sumAll(2, 3, 4, 5, 6, 7)}")

    println(createOutputString("Alice"))
    println(createOutputString("Bob", 23))
    println(createOutputString(isStudent = true, 
                               name = "Carol", 
                               age = 19))
    println(createOutputString("Daniel", 32, isStudent = null))

    println(multiplyBy(null, 4))
    println(multiplyBy(3, 4))
}
