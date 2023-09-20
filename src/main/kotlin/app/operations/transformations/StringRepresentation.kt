package app.operations.transformations

import java.lang.StringBuilder

fun main() {
    val list: List<String> = listOf("ahmad","ihsanullah","rabbani")

    val list1 : String = list.joinToString(" ","|","|", 2)
    println(list1)

    val list2 : String = list.joinToString(" ","|","|"){it.uppercase()}
    println(list2)

    val appendable = StringBuilder()
    list.joinTo(appendable," ","|","|" )
    list.joinTo(appendable," ","/","/" ){it}
    println(appendable.toString())
}