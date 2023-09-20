package app.operations.retrievecollectionparts

fun main() {
    //mengambil secara spesifik element yang ada di collection
    val chars : List<Char> = ('a'..'z').toList()

    //mengambil data
    println(chars.take(3)) //a,b,c
    println(chars.takeLast(3))//x,y,z
    println(chars.takeWhile { it < 'f' }) //a,b,c,d,e
    println(chars.takeLastWhile { it > 'f' }) //g,h,i,j..............

    //menghapus data
    println(chars.drop(2))//c,d,e,f,g,h,i,j
    println(chars.dropLast(3)) //a - w
    println(chars.dropWhile { it < 'f' }) //g,h,i,j........
    println(chars.dropLastWhile { it > 'f' })//a,b,c,d,e

    val buah = arrayOf("melon","anggur","ceri","mangga","sirsak")
    println(buah.dropLastWhile  { it.contains("a")  })
    println(buah.dropLastWhile  { it.length>4 })
}