package app.pair

import app.data.PersonKu

fun main() {
    val pair1: Pair<String, String> = Pair("Ahmad", "Ihsan")
    println(pair1.first)
    println(pair1.second)

    val pair2: Pair<Int, PersonKu> = 1 to PersonKu("ahmad")
    println(pair2.first)
    println(pair2.second)
}