package app.operations.retrivesingleelements

fun main() {
    val set = setOf("ahmad","ihsanullah","rabbani")

    println(set.first())
    println(set.last())
    println(set.elementAt(0))
    println(set.elementAtOrNull(2))
    println(set.elementAtOrNull(20))
    println(set.elementAtOrElse(2){"tidak ada"})
    println(set.elementAtOrElse(20){"Tidak ada"})

}