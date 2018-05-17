package oop

/**
 * fnzainal (c) 2018
 * write on 5/15/18 8:54 PM
 */

open class Mobil(carName: String, tahun: Int) : Kendaraan(){
    // public data
    var namaMobil = carName

    // set data private
    private var pinMobil = tahun

    // internal
    internal var tahunMobil = tahun
}