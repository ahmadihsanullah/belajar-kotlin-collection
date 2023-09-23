package app.list

fun main() {

    val list = listOf("ahmad","ihsan","rabbani","ahmad","iha","ihsan","bani","rabbani","ahmad","ihsan","rabbani")
    println(list.get(0))
    println(list.getOrNull(10))
    println(list.getOrElse(10){"tidak ada datanya"})
    println(list.subList(2,5))
//    fromIndex adalah indeks awal (inklusif), yang berarti elemen dengan indeks ini akan dimasukkan ke dalam sublist.
//    toIndex adalah indeks akhir (eksklusif), yang berarti elemen dengan indeks ini tidak akan dimasukkan ke dalam sublist.

    println(list.binarySearch("rabbani"))

    val numbers = (1..10).toList()

    println(list.indexOf("bani"))
    println(list.lastIndexOf("rabbani"))
    println(numbers.indexOfFirst { it > 5 }) //yaitu 6, di index ke 5
    println(numbers.indexOfLast { it > 5 }) //yaitu 10 di index ke 9
}