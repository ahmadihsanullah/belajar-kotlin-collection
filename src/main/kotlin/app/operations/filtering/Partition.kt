package app.operations.filtering

fun main() {
    val list = listOf<String>("ahmad","ihsanullah","rabbani")
    val (listMatch, listNotMatch) = list.partition { it.length > 6 }

    println(listMatch)
    println(listNotMatch)
}