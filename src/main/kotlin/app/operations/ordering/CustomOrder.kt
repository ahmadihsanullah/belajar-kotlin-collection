package app.operations.ordering

data class fruit(val name: String, val quantity: Int)
fun main() {
    val fruits = listOf<fruit>(
        fruit("Apple", 20),
        fruit("Manggo", 10),
        fruit("Banana", 5)
    )

    println(fruits.sortedBy { it.name })
    println(fruits.sortedBy { it.quantity })

    println(fruits.sortedByDescending { it.name })
    println(fruits.sortedByDescending { it.quantity })

    val numbers = listOf(18,13,21,25,26,22,16,19)
    //comparator
    println(numbers.sortedWith(Comparator{number1, number2 ->
            if(number1 % 10 > number2 %10){
                1
            }else{
                -1
            }
    }))


}