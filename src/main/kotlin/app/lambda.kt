package app

fun main() {
    val stringPlus: (String, String) -> String = String::plus
    val intPlus: (Int,Int) -> Int = Int::plus

    println(stringPlus.invoke("<-", "->"))
    println(stringPlus("Hello, ", "world!"))

    println(intPlus.invoke(1, 1))
    println(intPlus(1, 2))
//    println(2.intPlus(3)) // extension-like call

    val sum: (Int, Int) -> Int = { i, j -> i+j }
    println(sum(2,2))


}