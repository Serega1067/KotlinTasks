fun main() {
//    val num1: Int = readln().toInt()
//    val num2: Int = readln().toInt()
//    println("$num1 plus $num2 equals ${num1 + num2}")
//    val s = readln().split(' ')
//    val a = arrayOf()
//    for (i in s) {
//        println(i)
//    }
//    println(s.size)
//    println(s.javaClass.name)
//    println(s.javaClass.kotlin)
//    println(s.javaClass.simpleName)
//    println(s::class.simpleName)
//    val item: String = readln()
//    println("The obtained value is $item and its Int " +
//            "representation after division by 2 is " +
//            "${item.toInt() / 2}")
    val word: String = readln()
    println("${word.length} repetitions of the word ${word}: " +
            word.repeat(word.length)
    )

//    fun String.onlyLetters() = all { it.isLetter() }
//
//    if (word.onlyLetters()) {
//        println("true")
//    }
//    else {
//        println("false")
//    }

    if (word.onlyLetters()) {
        println("true")
    }
    else {
        println("false")
    }
}

fun String.onlyLetters() = all { it.isLetter() }
