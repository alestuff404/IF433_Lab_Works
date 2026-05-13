package oop_00000127234_NandaValeri.week12

fun main() {
    println("=== TEST RUNCATCHING ===")

    // Mencoba parsing string yang mengandung huruf (akan menyebabkan error)
    val result: Result<Int> = runCatching {
        "42X".toInt()
    }
}