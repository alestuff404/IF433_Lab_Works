package oop_00000127234_NandaValeri.week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0) { "Porsi kibble harus lebih dari 0 gr" }

    if (isJammed) throw DispenserJamException()
    if (requestedGram > availableGram) throw FoodEmptyException(requestedGram, availableGram)

    // ini lupa ke checkpoint kak tadi hehe
    println("Kibble berhasil dikeluarkan!")
    return availableGram - requestedGram
}

fun main() {
    var currentKibbleStock = 50
    println("--- Jadwal Pagi ---")
    try {
        currentKibbleStock = dispenseKibble(80, currentKibbleStock, false)
    } catch (e: DispenserJamException) {
        println("Error: ${e.message}")
    } catch (e: FoodEmptyException) {
        println("Error: ${e.message}")
    } catch (e: Exception) {
        println("General Error: ${e.message}")
    } finally {
        println("Siklus pengecekan dispenser pagi selesai.")
    }

    println("\n--- Jadwal Sore ---")
    currentKibbleStock = 1000 // Isi ulang [cite: 165]
    runCatching {
        dispenseKibble(30, currentKibbleStock, false)
    } .onSuccess { newStock ->
        currentKibbleStock = newStock
        println("Makan sore sukses! Sisa stok kibble: $currentKibbleStock gr")
    }
}