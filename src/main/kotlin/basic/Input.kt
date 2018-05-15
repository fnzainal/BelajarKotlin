package basic

/**
 * fnzainal (c) 2018
 * write on 5/14/18
 */

fun main(args: Array<String>){
    // print string
    print("Whats your name? ")

    // membaca inputan user
    val name = readLine()

    // print string
    print("How old are you? ")

    // membaca input user dg tipe data int
    val old: Int?= readLine()?.toInt()

    // print data yang telah diinput
    println("Olo $name !\nYou are $old years")
}