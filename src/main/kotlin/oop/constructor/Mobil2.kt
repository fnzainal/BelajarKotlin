package oop.constructor

import oop.Kendaraan

/**
 * fnzainal (c) 2018
 * write on 5/17/18 10:05 AM
 */

class Mobil2 : Kendaraan{

    var namaMobil = "Mobil"
    var tahunMobil = 123

    constructor(){

    }

    constructor(carName: String){
        // update value
        this.namaMobil = carName
    }

    constructor(carName: String, tahun:Int){
        // update value
        this.namaMobil = carName
        this.tahunMobil = tahun
    }

}