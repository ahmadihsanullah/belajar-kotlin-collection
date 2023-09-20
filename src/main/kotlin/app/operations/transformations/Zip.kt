package app.operations.transformations

fun main() {
//    transformasi yang digunakan untuk menggabungkan dua buah collection.

    val list1 = listOf("ahmad","ihsan","rabbani","hanif")
    val list2 = listOf("rehan","rizki","firdaus")

    val list3: List<Pair<String,String>> = list1.zip(list2)

    val list4: List<String> = list1.zip(list2){item1, item2 ->
        "$item1 $item2"
    }

    println(list3)
    println(list4)


}