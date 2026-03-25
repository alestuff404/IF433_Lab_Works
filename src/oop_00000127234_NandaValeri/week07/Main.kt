package oop_00000127234_NandaValeri.week07

import java.sql.DatabaseMetaData

fun main() {
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient() // instansiasi lewat factory
    client.connect()

    println("\n=== TEST REGULER CLASS ===")
    val reg1 = RegulerUser("Alice", 22)
    val reg2 = RegulerUser("Alice", 22)
    println(reg1) // akan mencetak memori hash
    println("Sama? ${reg1 == reg2}") // false
}