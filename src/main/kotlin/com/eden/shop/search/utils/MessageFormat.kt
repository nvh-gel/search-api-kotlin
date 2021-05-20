package com.eden.shop.search.utils

import org.springframework.context.MessageSource
import org.springframework.stereotype.Component
import java.util.*

@Component
class MessageFormat(val messageSource: MessageSource) {

    fun formatMessage(key: String) : String {

        return messageSource.getMessage(key, null, "", Locale.getDefault()).toString()
    }
}
