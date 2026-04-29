package oop_00000127234_NandaValeri.week10

class WalletRepository<T : Any> {

    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun searchByName(name: String): List<T> {
        return items.filter {
            when (it) {
                is Coin -> it.name.contains(name, ignoreCase = true)
                else -> false
            }
        }
    }
}