package app.list


fun main() {
    val mutableList: MutableList<String> = mutableListOf()
    mutableList.addAll(listOf("ahmad","ihsanullah","rabbani"))
    mutableList.add("hanif")
    mutableList.add( "han")
    mutableList.set(1,"ihsan")
    mutableList.containsAll(listOf("ihsan","hanif","rabbani"))

    println(mutableList.size )
    println(mutableList.elementAt(mutableList.size - 1))
    println("--------------------------------")
    mutableList.forEach{
            value -> println(value)
    }
}