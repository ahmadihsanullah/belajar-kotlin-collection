package app.operations.retrievecollectionparts

fun main() {
    val list1 = (1..100).toList()
    val list2 = list1.chunked(10)
    println(list2.size)
    println(list2)

    val list3 = list1.chunked(10){values ->
        var total = 0
        for(value in values){
            total+=value
        }
        total
    }
    val listku = listOf(1,2,3,4,5,6)
    println(list1.chunked(10){it.sum()})

    println(list3)
}