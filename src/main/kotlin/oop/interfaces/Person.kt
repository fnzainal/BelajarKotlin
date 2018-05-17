package oop.interfaces

/**
 * fnzainal (c) 2018
 * write on 5/17/18 2:40 PM
 */

open class Person(): PersonInterface{
    override fun talk() {
        println("This person is taling")
    }

    override fun walk() {
        println("This person is walking")
    }

    var name: String = ""
    var age: Int = 0
    var weight: Int= 0
}
