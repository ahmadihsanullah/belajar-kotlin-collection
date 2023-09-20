package app

fun <T> displayIterable(iterable: Iterable<T>):Unit{
    val iter = iterable.iterator()
    while(iter.hasNext()){
        val name = iter.next()
        println(name)
    }
}

fun main() {
    displayIterable(listOf("ahmad","ihsan"))
    displayIterable(setOf("ahmad","ihsan"))
    displayIterable(mapOf("ahmad" to "ihsan").entries)
    displayIterable(mutableListOf("ahmad","ihsan"))
    displayIterable(mutableSetOf("ahmad","ihsan"))
}
