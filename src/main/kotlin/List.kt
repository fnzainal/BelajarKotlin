fun main(args: Array<String>){
    val names = listOf<String>("Zain","Alfah","Rudin")
    println("name: "+names[0])
    println("Is name empty? "+names.isEmpty())
    println("Contain Zain name ? = "+names.contains("Zain"))
    println("Size = "+names.size)
    println("Index of = "+names.indexOf("Rudin"))
    println("Last is = "+names.last())
    println("First = "+names.first())

}