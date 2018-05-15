package basic
/**
 * fnzainal (c) 2018
 * write on 5/14/18 8:58 PM
 */

fun main(args: Array<String>){

    // print pesan string
    print("How much you are happy? ( between 1-10 ) :: ")

    // membaca input user
    val number: Int?= readLine()?.toInt()

    // validasi inputan untuk menentukan pesan
    val message = when (number) {
        1 -> "Ah, what happen to you?"
        2 -> "You are sad"
        3 -> "You are okay"
        4 -> "Is any problem?"
        5 -> "Nice, you are happy people"
        else -> "Wohoo, You're awesome"
    }

    // print pesan yang sesuai inputan
    println(message)

}