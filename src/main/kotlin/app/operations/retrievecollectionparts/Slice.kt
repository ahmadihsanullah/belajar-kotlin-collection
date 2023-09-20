package app.operations.retrievecollectionparts

fun main() {
    /**
    slice() returns a list of the collection elements with given indices.
    The indices may be passed either as a range or as a collection of integer values.
     */

    val list = (0..100).toList()

    val list2 = list.slice(0..50)
    val list3 = list.slice(0..100 step 2)
    val list4 = list.slice(100 downTo 0 step 2)

    println(list)
    println(list2)
    println(list3)
    println(list4)


    val numbers = listOf("one", "two", "three", "four", "five", "six")
    println(numbers.slice(1..3))
    println(numbers.slice(0..4 step 2))
    println(numbers.slice(setOf(3, 5, 0)))
}