package app

fun main() {
    val words = "The quick brown fox height jumps over the lazy dog".split(" ")
    val result = words
        .filter {
            println("filter : $it")
            it.length> 3
        }
        .map{
            println("map : $it")
            it.uppercase()
        }
        .take(4)

    println(result)

    println("======================")
    println("With Sequence")

    val sequence = words.asSequence()
    val resultSequence = sequence
        .filter {
            println("filter : $it")
            it.length> 3
        }
        .map{
            println("map : $it")
            it.uppercase()
        }
        .take(4)

    println(resultSequence.toList())
}