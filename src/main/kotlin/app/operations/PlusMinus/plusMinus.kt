package app.operations.PlusMinus

fun main() {
    val list1 = listOf("ahmad","ihsanullah","rabbani")
    val list2 = list1 + "hanif"
    println(list2)

    val list3 = list2 + listOf("hisbulhaq","rehan")
    println(list3)

    val list4 = list3 - listOf("hisbulhaq")
    println(list4)

    val list5 = list4.minus("hanif")
    println(list5)

    val map = mapOf("1" to "a", "2" to "b", "3" to "c")
    val map1 = map.plus("4" to "e")
    println(map1)

}