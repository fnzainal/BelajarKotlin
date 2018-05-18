package oop.enum_class

/**
 * fnzainal (c) 2018
 * write on 5/18/18 2:23 PM
 */

fun main(args: Array<String>){
    val person: Person = Person()
    println("action: "+person.action)
    person.doAction(PersonAction.BIKING)
    println("action: "+person.action)

    if (person.action.equals(PersonAction.BIKING)){
        println("Wohoo, I'm biking!")
    }
}