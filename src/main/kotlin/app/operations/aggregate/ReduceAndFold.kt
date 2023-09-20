package app.operations.aggregate

fun main() {
    val list = (1..10).toList()

    val max = list.reduce{first, second ->
        if(first > second) first else second
    }
    println(max)

    val min = list.reduce{first, second ->
        if(first < second) first else second
    }
    println(min)

    val sum = list.fold(0){first, second ->
        first + second
    }
    println(sum)

    val names = listOf("air","iha","han","ai")
    val count = names.fold(0){first, second ->
        first +1
    }

    println(names.count())
    println(count)

}