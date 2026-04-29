package oop_00000127234_NandaValeri.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 1.5))
    coinRepo.add(Coin("ETH", 8.2))
    coinRepo.add(Coin("USDT", 1500.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("=== CRYPTO DASHBOARD ===")
    println("Status: ${response.status}")

    response.data.forEach {
        println("Coin: ${it.name}, Balance: ${it.balance}")
    }

    val txRepo = WalletRepository<Transaction>()

    txRepo.add(Transaction("TX001", 50000.0))
    txRepo.add(Transaction("TX002", 12000.0))

    println("\n=== TRANSACTIONS ===")

    txRepo.getAll().forEach {
        println("Transaction ID: ${it.id}, Amount: ${it.amount}")
    }
}