fun main(args: Array<String>){

    print("Whats your name? ")
    val name = readLine()
    print("How old are you? ")
    val old: Int?= readLine()?.toInt()

    println("Olo $name !\nYou are $old years")
}