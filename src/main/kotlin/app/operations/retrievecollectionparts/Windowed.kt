package app.operations.retrievecollectionparts

fun main() {
//    mendapatkan semua kemungkinan collection sesuai dengan range yang telah ditentukan

    val numbers = listOf(1,2,3,4,5)

    println(numbers.windowed(3,1,false))
    println(numbers.windowed(3,1,false){it.size})
    println(numbers.windowed(3,1,false) { it.sum() })

    println(numbers.windowed(3,1,true))
    println(numbers.windowed(3,1,true){it.size})
    println(numbers.windowed(3,1,true){it.sum()})
}