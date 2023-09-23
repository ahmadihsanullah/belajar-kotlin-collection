package app.set

fun main() {
    val number1 = (1..10).toSet()
    val number2 = (6..15).toSet()

    //union = ambil sembua data, jika duplikat tetep diitung satu
    println(number1.union(number2)) //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]

    //mengambil data diantara keduanya yang sama saja
    println(number1.intersect(number2)) //[6, 7, 8, 9, 10]

    //yang ada di number1 tapi gk ada di number2
    println(number1.subtract(number2)) //[1, 2, 3, 4, 5]
}