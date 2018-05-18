package oop.enum_class

/**
 * fnzainal (c) 2018
 * write on 5/18/18 2:20 PM
 */

open class Person{
    var action: PersonAction = PersonAction.BIKING

    fun doAction(action: PersonAction) {
        this.action = action
    }
}