package basic

/**
 * fnzainal (c) 2018
 * write on 5/15/18
 */

var newNames: ArrayList<String> = arrayListOf()

fun main(args: Array<String>){
    //array list
    newNames = arrayListOf("Zain","Alfah","Rudin")
    // add item with index
    newNames.add(0,"Muhammad")
    // add item, with no index
    newNames.add("Rasyid")

    var optionMenu: String = "1"


    loop@
    while (optionMenu!="3"){
        println()
        println("1. Tambahkan teman")
        println("2. Hapus teman")
        println("3. Exit")

        println()
        print("Masukan code : ")
        optionMenu = readLine()!!
        when(optionMenu){
            "1"-> inputBestFriend()
            "2"-> deleteFriends()
            else -> break@loop
        }
    }
}

fun deleteFriends() {
    print("Input friend's name be delete : ")
    val friendToDelete = readLine()
    newNames.remove(friendToDelete)
    println("Deleting $friendToDelete ...")
    println()

    printListTeman()

}

private fun inputBestFriend() {
    val bestFriendInput: String ="test"
    var bestFriendInput1 = bestFriendInput
    while (bestFriendInput1 != "") {

        print("Type your friend's name: ")
        bestFriendInput1 = readLine()!!
        // add item to index
        newNames.add(bestFriendInput1!!)

        printListTeman()
    }
}

private fun printListTeman() {
    println("Here is list your friend:")
    for (name in newNames) {
        if (name != "") {
            println("Halo $name")
        }
    }
}