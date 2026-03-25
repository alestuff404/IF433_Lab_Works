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
    val data3 = data1.copy(age = 23)
    println("Hasil Copy: $data3")
    val (userName, userAge) = data1 // destructuring declaration
    println("Destructured: $userName berumur $userAge")

    println("\n=== TEST SEALED CLASS ===")
    val response: ApiResponse = ApiResponse.Success("Data berhasil ditarik!")
    // error when expression must be exhaustive
    val uiMessage = when (response) {
        is ApiResponse.Success -> "Tampilkan: ${response.data}"
        is ApiResponse.Error -> "Munculkan alert: ${response.massage}"
        is ApiResponse.Loading -> "Tampilkan Spinner"
    }
    println(uiMessage)

    println("\n\n=== SIMULASI GAME RPG (TUGAS MANDIRI) ===")
    GameManager.startGame()
    GameManager.startGame()
}