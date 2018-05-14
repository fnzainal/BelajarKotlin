fun main(args: Array<String>){

    print("How much you are happy? ( between 1-10 ) :: ")
    val number: Int?= readLine()?.toInt()
    val message = when (number) {
        1 -> "Ah, what happen to you?"
        2 -> "You are sad"
        3 -> "You are okay"
        4 -> "Is any problem?"
        5 -> "Nice, you are happy people"
        else -> "Wohoo, You're awesome"
    }
    println(message)

}