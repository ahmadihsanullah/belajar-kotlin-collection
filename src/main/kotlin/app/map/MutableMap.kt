package app.map

fun main() {
    val mutableMap : MutableMap<String, String> = mutableMapOf()
    mutableMap.put("a", "ahmad")
    mutableMap.put("b", "ihsan")
    mutableMap.put("c", "rabbani")

    mutableMap.set("a", "ahmadd")

    mutableMap.put("a", "aji")
    println(mutableMap.size)

    mutableMap.remove("a")

    for((key, value) in mutableMap){
        println("$key: $value")
    }
}