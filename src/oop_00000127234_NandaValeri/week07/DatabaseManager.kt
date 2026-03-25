package oop_00000127234_NandaValeri.week07

object DatabaseManager {
    var connectionStatus:String = "Disconnect"

    fun connect() {
        connectionStatus = "Connected to server"
        println("Database is ready.")
    }
}