package app.list

fun main() {
    val list: List<String> = listOf("ahmad","ihsanullah","rabbani")
    println(list[0])
    println(list.get(1))
    println(list.indexOf("rabbani"))
    println(list.indexOf("ahmad"))
    println(list.isEmpty())
    println(list.contains("rabbani"))

    val numbers = listOf("1","2","3","empat","lima","6")
    val nilai: List<Int> = numbers.mapNotNull {
        it.toIntOrNull()
    }

    println(nilai)
}