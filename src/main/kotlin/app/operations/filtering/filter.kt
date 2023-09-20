package app.operations.filtering

fun main() {
    val numbers = listOf("one", "two", "three", "four")
    val longerThan3 = numbers.filter { it.length > 3 }
    val longerlest3 = numbers.filterNot { it.length > 3 }
    val numbersIndexed = numbers.filterIndexed{ index, value -> index % 2 == 0}
    println(longerThan3)
    println(numbersIndexed)
    println(longerlest3)

    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key11" to 11, "umur" to 20)
    val filteredMap = numbersMap.filter { (key, value) -> key.startsWith("u") && value > 10}
    println(filteredMap)

    val list = listOf(null, "eko","kurniawan",1 ,2 ,3, "khanndedy",null)
    val listString = list.filterIsInstance<String>()
    println(listString)
    val listInt = list.filterIsInstance<Int>()
    println(listInt)

    val listNotNull = list.filterNotNull()
    println(listNotNull)
}