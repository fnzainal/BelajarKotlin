fun main(args: Array<String>){
    // var = mutable -- can change
    var a = 1
    a= 123 // of course can be change

    println("var data= $a")

    // val = immutable -- cannot change
    val title = "testing"
//    title = "cannot change" // will failed compile
    println(title)
}