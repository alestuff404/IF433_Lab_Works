package oop_00000127234_NandaValeri.week02

class Student (
    val name: String,
    val nim: String,
    var gpa: Double = 0.0,
    var major: String,
) {
    constructor(name: String, nim: String) : this(name, nim, 0.0, "Non-Matriculated") {
        println("LOG: Menggunakan constructor jalur umum (Tanpa Jurusan).")
    }

    init {
        if (nim.length != 5) {
            println("WARNING: Objek tercipta dengan NIM ($nim) yang tidak valid!");
            println("Data mahasiswa $name mungkin akan bermasalah di sistem.")
        } else {
            println("LOG: Objek Student $name berhasil di alokasikan di Memory")
        }
    }
}
