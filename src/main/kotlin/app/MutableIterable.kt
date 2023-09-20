package app

fun <T> displayMutableIterable(iterable: MutableIterable<T>):Unit{
    val iter = iterable.iterator()
    while (iter.hasNext()) {
        var name = iter.next()
        if (name == "ihsan") {
            iter.remove()
        }
    }
}

fun printMutableIteable(mutableIterable: MutableIterable<String>):Unit{
    val iter = mutableIterable.iterator()
    while(iter.hasNext()) println(iter.next())
}

fun main() {
    //error karena list, set dan map bukan turunan dari mutableiterable
//    displayMutableIterable(listOf("ahmad","ihsan"))
//    displayMutableIterable(setOf("ahmad","ihsan"))
//    displayMutableIterable(mapOf("ahmad" to "ihsan").entries)
    val mutableiterable = mutableListOf("ahmad", "ihsan","hanif","rehan","iha")
    displayMutableIterable(mutableiterable)
    printMutableIteable(mutableiterable)

}
