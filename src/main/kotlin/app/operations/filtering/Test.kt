package app.operations.filtering

fun main() {
    val list = listOf("ahmad","ihsanullah","rabbani")

    val listAny = list.any { it.length > 5 }
    println(listAny)
    val listNone = list.none { it.length > 20} //tidak ada lengthnya yang lebih dari 20
    println(listNone)
    println(list.all { it.length > 5 })
    println(list.any()) // ada datanya??
    println(list.none()) // tidak ada datanya??

}