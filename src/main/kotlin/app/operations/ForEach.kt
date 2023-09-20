package app.operations

fun main() {
    listOf("ahmad", "ihsanullah","rabbani").forEach{
        println(it)
    }

    mutableListOf<String>("ahmad", "ihsan","rabbani").forEachIndexed{
        key, value -> println("$key : $value")
    }
}