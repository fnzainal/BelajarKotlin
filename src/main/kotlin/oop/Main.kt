package oop

import oop.constructor.Mobil2
import oop.data.Person

/**
 * fnzainal (c) 2018
 * write on 5/15/18 8:58 PM
 */

fun main(args: Array<String>) {
    val mobil = Mobil("Honda Mobilio", 2015)
    println("mobil : " + mobil.namaMobil)
    println("start : " + mobil.tahunMobil)

    val pickUp = Mobil("VW Combi", 1998)
    pickUp.tahunMobil // on mobil
    pickUp.hidupkanMesin() // on kendaraan
    pickUp.startMesin() // mesin

    val tractor = Traktor()
    tractor.statBajak()
    tractor.startMesin()
    tractor.hidupkanMesin()
    tractor.matikanMesin()

    val mobil2 = Mobil2("Kijang", 2000)
    println("mobil : " + mobil2.namaMobil)
    println("start : " + mobil2.tahunMobil)

    val person = Person("Zain", 21)
    println("person is ${person.nama}")
    println("age is ${person.age}")

    val singleton= SingletonPerson
    singleton.name = "Zain"
    SingletonPerson.name = "Rudin"


    val singleton2= SingletonPerson
    println("singleton 1 ${singleton.name}")
    println("singleton 2 ${singleton2.name}")


}