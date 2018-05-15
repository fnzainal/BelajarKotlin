fun main(args: Array<String>){
    // var = mutable -- bisa dirubah nilai / value nya
    var a = 1
    a= 123 // bisa diubah

    // mengeprint nilai variabel a
    println("var data= $a")

    // val = immutable -- tidak bisa diubah nilai nya
    val title = "testing"
//    title = "cannot change" // akan gagal mengcompile jika di run
    println(title)
}