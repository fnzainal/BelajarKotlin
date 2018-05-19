package oop.setter_getter

import oop.enum_class.PersonAction

/**
 * fnzainal (c) 2018
 * write on 5/18/18 2:47 PM
 */

class GetterSetterClass(){
    var action: PersonAction = PersonAction.BIKING
//    get() = PersonAction.WALK

    set(value){
        field=PersonAction.WALK // will return WALK
        PersonAction.WALK // will return BIKING
    }
}