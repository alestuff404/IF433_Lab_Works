package oop_00000127234_NandaValeri.week10

data class ApiResponse<T>(
    val status: String,
    val data: T
)