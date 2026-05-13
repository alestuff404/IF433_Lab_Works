package oop_00000127234_NandaValeri.week12

fun main() {
    println("=== TEST RUNCATCHING ===")

    // Mencoba parsing string yang mengandung huruf (akan menyebabkan error)
    val result: Result<Int> = runCatching {
        "42X".toInt()
    }
    // Pattern: getOrElse (memberikan nilai default -1 jika gagal)
    val safeValue = result.getOrElse { -1 }
    println("Safe Value (getOrElse): $safeValue")

    // Pattern: recover (mengubah kegagalan menjadi sukses dengan nilai 0)
    val recovered = result.recover { 0 }.getOrNull()
    println("Recovered Value: $recovered")
}