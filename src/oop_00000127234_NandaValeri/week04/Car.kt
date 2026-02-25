package oop_00000127234_NandaValeri.week04

// car "Is-A" vehicle, parameter brand dilempar ke atas melalui vehicle(brand)
open class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand) {

    fun openTrunk() {
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka.")
    }
}