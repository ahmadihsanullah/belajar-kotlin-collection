package app.map

fun main() {
    val map = mapOf(
        "a" to "ahmad",
        "b" to "ihsanullah",
        "c" to "rabbani"
    )

    println(map.get("a"))
    println(map.getOrElse("d"){"tidak ada datanya"})
    println(map.getOrDefault("d", "tidak ada data"))
    println(map.filter { entry -> entry.value.length>5 })
    println(map.filterKeys { it != "b" })
    println(map.filterValues { it.length >5 })
}