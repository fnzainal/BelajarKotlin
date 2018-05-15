package basic

/**
 * fnzainal (c) 2018
 * write on 5/15/18 9:58 AM
 */

fun main(args: Array<String>){
    // memanggil function print
    showGreeting()

    // menampilkan print
    println("What's your name? :")

    // membaca input user
    val name: String? = readLine()
    // memanggil function dengan parameter tanpa return
    displayName(name)

    // memanggil function dengan return Int
    val hasil = hitungNilai(4, 3)

    // menampilkan print
    println("Result is = $hasil")
}

/**
 * function dengan param, dan tanpa return
 */
fun displayName(name: String?) {
    println("Your name is $name")
}

/**
 * function tanpa return, tanpa parameter
 */
fun showGreeting() {
    println("Halo, ini adalah kotlin")
}

/**
 * hitung nilai dengan return Int
 * @param num1 nilai 1
 * @param num2 nilai 2
 */
fun hitungNilai(num1: Int, num2: Int): Int {
    // menghitung nilai, dan mengembalikannya
    return num1*num2
}
