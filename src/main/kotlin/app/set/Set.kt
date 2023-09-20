package app.set

import app.data.Person

fun main() {
    val set: Set<Person> = setOf(
        Person("ahmad"), Person("ihsanullah"),Person("rabbani"),
        Person("ahmad"), Person("ihsanullah")
    )

    println(set)
    println(set.size)
    println(set.contains(Person("ihsanullah")))
    set.forEach{
        println(it.toString())
    }

    for(person in set){
        println(person.toString() == "ahmad" ?: "ahmad")
    }
}