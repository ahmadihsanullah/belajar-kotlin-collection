package app.map

fun main() {
    val map : Map<String, String> = mapOf(
        Pair("a", "ahmad"),
        "b" to "ihsanullah",
        "c" to "rabbani"
    )

    println(map.size)
    println(map.get("a"))
    println(map.get("b"))
    println(map.containsValue("rabbani"))

    map.forEach({
        (key, value) -> println(key + ": " + value)
    })

    for(i in map.entries){
        println(i.key)
        println(i.value)
    }

    val mapmutable: MutableMap<String,String> = mutableMapOf()
    mapmutable.put("a", "rabbani")
    mapmutable.put("b", "rabbani")

    for (i in mapmutable.entries){
        println(i.key)
        println(i.value)
    }
    println(mapmutable)
}