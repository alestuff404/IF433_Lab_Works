package oop_00000127234_NandaValeri.week01

fun main() {
    val name = "Nanda Slayy"
    val score = 80

    // concatenation gaya lama
    println("Nama: $name, Nilai: $score")

    val grade = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
    println("Grade kamu: $grade")
    println("Status: ${calculateStatus(score)}")
}

fun calculateStatus(score: Int) = if (score > 75) "Lulus" else "Tidak Lulus"