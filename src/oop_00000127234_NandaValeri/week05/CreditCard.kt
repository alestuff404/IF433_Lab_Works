package oop_00000127234_NandaValeri.week05

class CreditCard(
    accountName: String,
    val limit: Double
) : PaymentMethod(accountName) {

    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        println("Memproses pembayaran Credit Card oleh $accountName sebesar $amount")

        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("Transaksi berhasil. Total terpakai: $usedAmount")
        } else {
            println("Transaksi ditolak. Melebihi limit kartu.")
        }
    }
}