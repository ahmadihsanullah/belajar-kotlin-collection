package app.collection

fun <T>displayGetCollection(collection: Collection<T>):Unit{
    for(element in collection){
        print("$element\n")
    }
}

fun main() {
    displayGetCollection(listOf("ahmad","ihsan"))
    displayGetCollection(setOf("ahmad","ihsan"))
    displayGetCollection(mapOf("ahmad" to "ihsan").entries)
//    displayGetCollection(mapOf<>("ahmad","ihsan")) error, karena map bukan turunan collectio
}