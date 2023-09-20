package app

fun main() {
    val array = arrayOf(1,2,39,12,32,31,25,2,22)
    val range = 0..100

    val lists = array.toList()
    val mutableList = range.toMutableList()

    val set = array.toSet()
    val mutableSet = range.toMutableSet()

    val sortedSet = array.toSortedSet(Comparator { o1, o2 -> o2.compareTo(o1)  })

    val name= "ihsan"
    println(name.replaceFirstChar { it.uppercase() })

}