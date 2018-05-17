package oop.interfaces

/**
 * fnzainal (c) 2018
 * write on 5/17/18 2:49 PM
 */

fun main(args: Array<String>) {
    speakName(object : ExampleCallback{
        override fun speakMyName(name: String) {
            println("Your name $name")
        }

    })
}

fun speakName(callBack : ExampleCallback) {
    callBack.speakMyName("Zain")
    callBack.speakMyName("Alfah")
    callBack.speakMyName("Rudin")
}