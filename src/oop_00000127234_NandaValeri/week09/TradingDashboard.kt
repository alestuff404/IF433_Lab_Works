package oop_00000127234_NandaValeri.week09

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 20, -10.0, "CLOSED"),
        TradeLog("BNBUSDT", "LONG", 5, 2.5, "OPEN"),
        TradeLog("ETHUSDT", "LONG", 10, 8.0, "CLOSED"),
        TradeLog("SOLUSDT", "SHORT", 15, -12.3, "CLOSED")
    )
    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
    val winningTrades = closedTrades.filter { it.roe > 0 }
}