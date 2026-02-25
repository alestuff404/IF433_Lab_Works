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

    println("\n===== EMPLOYEE HIERARCHY TEST =====")

    val manager = Manager("Budi", 10_000_000)
    val developer = Developer("Nanda", 8_000_000, "Kotlin")

    manager.work()
    println("Bonus Manager: Rp ${manager.calculateBonus()}")

    developer.work()
    println("Bonus Developer: Rp ${developer.calculateBonus()}")
}