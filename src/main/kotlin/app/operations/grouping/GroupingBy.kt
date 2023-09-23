package app.operations.grouping

fun main() {
    val list = listOf("a","a","b","b","c","c","d","d","e","e","f")
    val grouping = list.groupingBy { it }

    println(grouping.eachCount()) // menghitung jumlah data di tiap group
    val reduce = grouping.reduce{key, first , second -> first + second}
    println(reduce)

    val fold = grouping.fold(0) {first, second -> first+1}
    println(fold)

    val aggregate = grouping.aggregate{key, first: String?, second, isFirst ->
        if(isFirst) second
        else first + second
    }
    println(aggregate)
}