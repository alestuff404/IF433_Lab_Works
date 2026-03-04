package oop_00000127234_NandaValeri.week05

fun main() {

    // ===============================
    // POLYMORPHISM (OVERRIDING)
    // ===============================
    val dosen1 = Dosen("Pak Alex", "0123456")
    val admin1 = Admin("Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("-------------------------------")
    }

    // ===============================
    // POLYMORPHISM (OVERLOADING)
    // ===============================
    println("\n=== PERHITUNGAN LUAS BANGUN DATAR ===")

    val mathHelper = MathHelper()

    val luasPersegi = mathHelper.hitungLuas(4)
    println("Luas Persegi (sisi = 4): $luasPersegi")

    val luasPersegiPanjang = mathHelper.hitungLuas(5, 3)
    println("Luas Persegi Panjang (5 x 3): $luasPersegiPanjang")

    val luasLingkaran = mathHelper.hitungLuas(7.0)
    println("Luas Lingkaran (r = 7.0): $luasLingkaran")
}