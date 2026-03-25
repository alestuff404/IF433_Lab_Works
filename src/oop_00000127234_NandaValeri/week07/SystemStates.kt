package oop_00000127234_NandaValeri.week07

import javax.xml.crypto.Data

enum class AppState {
    STARTING, RUNNING, STOPPED
}

sealed class ApiResponse {
    data class Success(val data: String) : ApiResponse()
    data class Error(val massage: String) : ApiResponse()
    object Loading: ApiResponse()
}