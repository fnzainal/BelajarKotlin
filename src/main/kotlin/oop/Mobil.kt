package oop

/**
 * fnzainal (c) 2018
 * write on 5/15/18 8:54 PM
 */

open class Mobil: Mesin(){
    var namaMobil = "Honda Jazz"

    fun hidupkanMesin(): String {
        return "gruuumhh.. mesin dihidupkan."
    }
    // set data private
    internal var tahunMobil = 2009

    private var pinMobil = 890123
    fun tampilkanTahun(): Int {
        return tahunMobil
    }

    fun tampilkanPin(): Int {
        return pinMobil
    }
}