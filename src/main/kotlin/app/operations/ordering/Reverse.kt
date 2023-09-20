package app.operations.ordering

fun main() {
    val list = mutableListOf("ahmad","ihsanullah")

    val listReverse = list.reversed()
    val listAsReversed = list.asReversed()

    println(listReverse)
    println(listAsReversed)

    list.add("rabbani")

    println(listReverse)
    println(listAsReversed)
}