package oop_00000127234_NandaValeri.week05

fun main() {

    // ==================================================
    // 1️⃣ RUNTIME POLYMORPHISM (Pegawai)
    // ==================================================
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

    // ==================================================
    // 2️⃣ COMPILE-TIME POLYMORPHISM (Overloading)
    // ==================================================
    println("\n=== PERHITUNGAN LUAS ===")

    val mathHelper = MathHelper()

    println("Luas Persegi: ${mathHelper.hitungLuas(4)}")
    println("Luas Persegi Panjang: ${mathHelper.hitungLuas(5, 3)}")
    println("Luas Lingkaran: ${mathHelper.hitungLuas(7.0)}")

    // ==================================================
    // 3️⃣ ABSTRACTION + POLYMORPHISM + SMART CASTING (Checkpoint 11)
    // ==================================================
    println("\n=== SISTEM PEMBAYARAN ===")

    val ewallet = EWallet("Nanda", 50000.0)
    val creditCard = CreditCard("Nanda", 100000.0)

    val methods: List<PaymentMethod> = listOf(ewallet, creditCard)

    for (method in methods) {

        method.processPayment(75000.0)

        // SMART CASTING
        if (method is EWallet) {
            println("-> EWallet terdeteksi. Melakukan top up 50000...")
            method.topUp(50000.0)

            println("-> Mencoba pembayaran ulang...")
            method.processPayment(75000.0)
        }

        println("-------------------------------")
    }
}