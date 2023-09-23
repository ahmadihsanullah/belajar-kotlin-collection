package app

class Application(map: Map<String, Any>){
    val name : String by map
    val version : Int by map
}
fun main() {
    val map = mapOf(
        "name" to "belajar kotlin collection",
        "version" to 1.2,
        "description" to "belajar kotlin collection jilid 1"
    )

    val app = Application(map)
    println(app.name)
    println(app.version)
}