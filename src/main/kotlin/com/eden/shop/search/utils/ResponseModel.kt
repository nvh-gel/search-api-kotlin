package com.eden.shop.search.utils

@Suppress("unused")
data class ResponseModel(val responseCode: ResponseCode, var data: Any?) {

    val code: String = responseCode.code
    var message: String = responseCode.message
}
