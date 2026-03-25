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
    val data1 = DataUser("Alice", 22)
    val data2 = DataUser("Alice", 22)
    println(data1) // otomatis readable format
    println("Sama? ${data1 == data2}") // true
}