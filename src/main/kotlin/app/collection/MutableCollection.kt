package app.collection

fun <T>displayGetMutableCollection(collection: MutableCollection<T>):Unit{
    for(element in collection){
        print("$element\n")
    }
}

fun main() {
    //error, karena list, map dan set bukan turunan mutable collection
    /**
     *     displayGetMutableCollection(listOf("ahmad","ihsan"))
     *     displayGetMutableCollection(setOf("ahmad","ihsan"))
     *     displayGetMutableCollection(mapOf("ahmad" to "ihsan").entries)
     */

    displayGetMutableCollection(mutableListOf("ahmad", "ihsan"))
    displayGetMutableCollection(mutableSetOf("ahmad", "ihsan"))
    displayGetMutableCollection(mutableMapOf("ahmad" to "ihsan").entries)

}