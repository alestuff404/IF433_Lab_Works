package oop_00000127234_NandaValeri.week12

class InsufficientFundsException(val amount: Double, val balance: Double) :
    Exception("Attempted $amount, balance: $balance")
