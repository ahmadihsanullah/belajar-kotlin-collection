package app.operations.transformations

fun main() {
    //collection to map operations
    //merubah value
    val numbers = listOf("one", "two", "three", "four")
    println(numbers.associateWith { it.length })
    //merubah key
    val numbers2 = listOf("one", "two", "three", "four")
    println(numbers2.associateBy { it.first().uppercaseChar() })
    //merubah key value
    val names = listOf("Alice Adams", "Brian Brown", "Clara Campbell")
    println(names.associate { Pair(it.length, it.uppercase()) })
}