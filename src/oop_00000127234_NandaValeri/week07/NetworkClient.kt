package oop_00000127234_NandaValeri.week07

class NetworkClient private constructor(val url:String) {
    fun connect() {
        println("Connecting to $url...")
    }
}