fun main(args: Array<String>){
    //array list
    val newNames = arrayListOf("Zain","Alfah","Rudin")
    // add item with index
    newNames.add(0,"Muhammad")

    // add item, with no index
    newNames.add("Rasyid")

    // input name
    print("What your new friend name? ")
    val nameFriends = readLine()
    // add item to index
    newNames += nameFriends!!

    println("Here is list your friend:")
    for (name in newNames){
        println("Halo $name")
    }
}