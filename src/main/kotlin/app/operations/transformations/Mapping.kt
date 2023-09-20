package app.operations.transformations

fun main() {
    val list: List<String> = listOf("ahmad","ihsan","hanif","rehan","iha")


    // old trick
//    val temp = mutableListOf<String>()
//    for(value in list){
//        temp.add(value.uppercase())
//    }

    val list2 = list.map { value -> value.uppercase() }
    println(list2)
    //use it
    val list3 = list2.map { it.lowercase() }
    println(list3)

    val set1  = setOf("ahmad", "ihsan","hanif", null)
    val set2 = set1.map { it?.uppercase() }

    println(set2)

    list2.mapIndexed{index, value -> println("$index : $value") }

    list3.mapIndexedNotNull{index, name ->
        if(index %2 ==  0) println(name)
    }

    println( set2.mapNotNull { it })

    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key11" to 11)
    println(numbersMap.mapKeys { it.key.uppercase() })
    println(numbersMap.mapValues { it.value + it.key.length })

}