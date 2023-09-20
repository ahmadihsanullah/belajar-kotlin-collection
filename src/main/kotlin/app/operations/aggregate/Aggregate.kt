package app.operations.aggregate

fun main() {
    val list = (1..100).toList()

    println(list.min())
    println(list.max())
    println(list.average())
    println(list.count())
    println(list.minOrNull())

    val names = listOf("ahmad","iha","rabbani")
    println(names.max())
}