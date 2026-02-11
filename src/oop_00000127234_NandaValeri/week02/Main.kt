package oop_00000127234_NandaValeri.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- APLIKASI PMB UMN ---")
    println("Masukkan nama: ")
    val name = scanner.nextLine()

    println("Masukkan NIM (Wajib 5 Karakter): ")
    val nim = scanner.next()
    scanner.nextLine()

    if (nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
    } else {
        print("Pilih jalur (1. Reguler, 2. Umum): ")
        val type = scanner.nextInt()
        scanner.nextLine()

        if (type == 1) {
            print("Masukkan Jurusan: ")
            val major = scanner.nextLine()
            val s1 = Student(name, nim, 0.0, major)
            println("Status: Pendaftaran Selesai.")
            println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")
        } else if (type == 2) {
            val s2 = Student(name, nim)
            println("Status: Pendaftaran Selesai.")
            println("Terdaftar di: ${s2.major} dengan GPA awal ${s2.gpa}")
        } else {
            println("Pilihan ngawur!")
        }
    }

    println("\n--- SISTEM PERPUSTAKAAN ---")
    print("Judul Buku: ")
    val title = scanner.nextLine()

    print("Nama Peminjam: ")
    val borrowerName = scanner.nextLine()

    print("Lama Pinjam (Hari): ")
    var duration = scanner.nextInt()
    scanner.nextLine()

    if (duration < 0) {
        duration = 1
    }

    val loanData = Loan(title, borrowerName, duration)

    println("\n--- DETAIL PEMINJAMAN ---")
    println("Judul: ${loanData.bookTitle}")
    println("Peminjam: ${loanData.borrower}")
    println("Durasi: ${loanData.loanDuration} hari")
    println("Total Denda: Rp ${loanData.calculateFine()}")
}