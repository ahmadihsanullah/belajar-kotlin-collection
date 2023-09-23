package app

fun main() {
    val map = mapOf(
        "a" to "ahmad",
        "b" to "ihsan"
    )

    for((key, value) in map){
        println("${key} = ${value}")
    }

    map.forEach { (key,value) -> println("${key} = ${value}") } //balikannya harus entry
}