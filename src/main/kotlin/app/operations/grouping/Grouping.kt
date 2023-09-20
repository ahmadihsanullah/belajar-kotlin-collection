package app.operations.grouping

fun main() {
//    operasi untuk meng-grup kan element-element yang ada di collection menjadi Map

    val list = setOf("ahmad","ihsan","rabbani","air")
    val map1 = list.groupBy { it.length }
    println(map1)
    val map2: Map<Int, List<String>> = list.groupBy { it.length }
    println(map2)

    val grouping = list.groupingBy { it.first()}
    println(grouping)


}