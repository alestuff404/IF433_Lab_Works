package oop_00000127234_NandaValeri.week01

fun main() {
    val gameTitle = "Elden Ring"
    val price = 600000
    val userNote: String? = null

    val finalPrice = calculateDiscount(price)

    printReceipt(
        title = gameTitle,
        finalPrice = finalPrice,
        note = userNote
    )
}

fun calculateDiscount(price: Int): Int =
    if (price > 500_000) price - (price * 20 / 100)
    else price - (price * 10 / 100)

fun printReceipt(title: String, finalPrice: Int, note: String?) {
    println("Game Title : $title")
    println("Final Price: Rp $finalPrice")
    println("Note       : ${note ?: "Tidak ada catatan"}")
}
