fun main(args: Array<String>){
    val names = listOf("Zain","Alfah","Rudin")
    // mengambil item dari sebuah list
    println("name: "+names[0])

    // cek apakah kosong?
    println("Is name empty? "+names.isEmpty())

    // cek apakah di list terdapat suatu item
    println("Contain Zain name ? = "+names.contains("Zain"))

    // list size
    println("Size = "+names.size)

    // mencari index suatu item
    println("Index of = "+names.indexOf("Rudin"))

    // menampilkan item terakhir
    println("Last is = "+names.last())

    // menampilkan item pertama
    println("First = "+names.first())

}