package oop_00000127234_NandaValeri.week01

fun main() {
    val gameTitle = "Elden Ring"
    val price = 600000

    val finalPrice = calculateDiscount(price)

    println(finalPrice)
}

fun calculateDiscount(price: Int): Int =
    if (price > 500_000) price - (price * 20 / 100)
    else price - (price * 10 / 100)

