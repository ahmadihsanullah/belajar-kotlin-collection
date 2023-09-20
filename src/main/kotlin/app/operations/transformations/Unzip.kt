package app.operations.transformations

fun main() {
//    pair to 2 collection
    val list : List<Pair<String, String>> = listOf(
        "ahmad" to "hanif",
        "ihsan" to "hizbul"
    )

    val pair : Pair<List<String>, List<String>> = list.unzip()
    println(pair.first)
    println(pair.second)

    val pairlagi = listOf<Pair<String, String>>(
        "ahmad" to "ihsan",
        "ihsan" to "hizbul"
    )

    val unzip = pairlagi.unzip()
    println(unzip)
}
