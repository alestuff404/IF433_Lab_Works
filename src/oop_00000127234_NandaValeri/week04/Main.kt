package oop_00000127234_NandaValeri.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car("Toyota", numberOfDoors = 4)
    myCar.openTrunk() // memanggil method milik sendiri
    myCar.honk() // memanggil method yang sudah di-override
    myCar.accelerate() // memanggil gabungan method parent dan child

    println("\n===== ELECTRIC CAR TEST =====")
    val tesla = ElectricCar("Tesla", 4, 85)

    tesla.accelerate()
    tesla.honk()
    tesla.openTrunk()
}