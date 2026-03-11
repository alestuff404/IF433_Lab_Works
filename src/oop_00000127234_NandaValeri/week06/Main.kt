package oop_00000127234_NandaValeri.week06

fun processCheckout(method: PaymentMethod, amount: Double) {
    println("-> Memulai checkout...")
    method.pay(amount)
}

fun main() {

    // ===============================
    // TEST DEVICE DASAR
    // ===============================
    val myWatch = SmartWatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    // ===============================
    // TEST PAYMENT SYSTEM
    // ===============================
    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== TESTING CHECKOUT ===")
    processCheckout(pay1, 50000.0)
    processCheckout(pay2, 150000.0)

    // ===============================
    // SMART HOME SYSTEM (Checkpoint 19 & 20)
    // ===============================
    println("\n=== SMART HOME SYSTEM ===")

    val lamp = SmartLamp("L001", "Ruang Tamu")
    val speaker = SmartSpeaker("S001", "Google Nest Dapur")
    val cctv = SmartCCTV("C001", "Ezviz Garasi")
}