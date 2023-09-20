package app.operations.transformations

class member(val name: String, val hobbies: List<String>)

fun main() {
    val list1: List<List<String>> = listOf(
        listOf("ahmad","ihsanullah","rabbani"),
        listOf("ahmad","ihsanullah","rabbani"),
        listOf("ahmad","ihsanullah","rabbani"),
        listOf("ahmad","ihsanullah","rabbani"),
    )

    val flat: List<String> = list1.flatten()
    println(flat)

    val members : List<member> = listOf(
        member("ahmad", listOf("reading", "coding")),
        member("hanif", listOf("joging", "coding"))
    )

//    val hobbies = members.map { it.hobbies} => return List<String>
    val hobbies = members.flatMap { it.hobbies }
    println(hobbies)
}