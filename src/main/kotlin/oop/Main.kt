package oop

/**
 * fnzainal (c) 2018
 * write on 5/15/18 8:58 PM
 */

fun main(args: Array<String>){
    val mobil = Mobil()

    mobil.tahunMobil
    println("nama mobil = "+mobil.namaMobil)
    println("start : "+mobil.hidupkanMesin())
    println("tahun : "+mobil.tampilkanTahun())
    println("pin   : "+mobil.tampilkanPin())

    val pickUp = PickUp()
    pickUp.bukaBak()
    pickUp.tahunMobil
    pickUp.hidupkanMesin()
    pickUp.matikanMesin()
}