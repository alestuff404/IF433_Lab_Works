package oop_00000127234_NandaValeri.week11

fun main() {
    println("=== TEST LET FUNCTION ===")
    val name: String? = "Alexander"
    val length = name?.let {
        println("Nama terdeteksi: $it")
        it.length
    }
    println("Panjang nama: $length")

    println("\n=== TEST RUN FUNCTION ===")
    val result = "Kotlin".run {
        println("Memproses kata: ${this}")
        length?.times(2) ?: 0
    }
    println("Hasil kalkulasi run: $result")
}