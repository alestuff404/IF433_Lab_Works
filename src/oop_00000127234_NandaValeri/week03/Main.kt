package oop_00000127234_NandaValeri.week03

fun main() {
    val e = Employee("Budi")
    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerformance()
    println("Pajak yang harus dibayar: ${e.tax}")

    println("\n===== WEAPON TEST =====")
    val weapon = Weapon("Excalibur")
    weapon.damage = -50
    weapon.damage = 9999
    println("Damage: ${weapon.damage}")
    println("Tier: ${weapon.tier}")

    println("\n===== PLAYER TEST =====")
    val player = Player("Nanda")
    player.addXp(50)
    player.addXp(60)
}