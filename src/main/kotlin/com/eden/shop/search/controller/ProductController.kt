package com.eden.shop.search.controller

import com.eden.shop.search.utils.MessageFormat
import com.eden.shop.search.utils.ResponseCode
import com.eden.shop.search.utils.ResponseModel
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("product")
class ProductController(val messageFormat: MessageFormat) {

    @GetMapping
    fun searchProduct(): ResponseEntity<ResponseModel> {

        val responseModel = ResponseModel(ResponseCode.SUCCESS, null)
        responseModel.message = messageFormat.formatMessage(responseModel.message)
        return ResponseEntity.ok(responseModel)
    }
}
