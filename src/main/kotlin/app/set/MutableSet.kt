package app.set

import app.data.PersonKu

fun main() {
    val mutableSet :  MutableSet<PersonKu> = mutableSetOf(
        PersonKu("ahmad"),
        PersonKu("hanif"),
        PersonKu("rehan"),
        PersonKu("rehan"),
        PersonKu("hanif")
    )
    mutableSet.removeIf{it.name == "ahmad"}
    mutableSet.add(PersonKu("rijal"))
    mutableSet.remove(PersonKu("rehan"))
    println(mutableSet.size)
    for(name in mutableSet){
        println(name)
    }

    mutableSet.forEach{
//        value -> println(value)
    }

}