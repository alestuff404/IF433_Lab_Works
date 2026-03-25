package oop_00000127234_NandaValeri.week07

import java.sql.DatabaseMetaData

fun main() {
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient() // instansiasi lewat factory
    client.connect()
}