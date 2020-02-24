package ru.skillbranch.dev_intensive_2019.models

import java.util.*

class TextMessage(
    id: String,
    from: User?,
    chat: Chat,
    isIncoming: Boolean = false,
    date: Date = Date(),
    val text : String?
): BaseMessage(id,from,chat,isIncoming,date) {



    override fun formatMessage(): String = "id:$id ${from?.firstName}"+
            " ${if (isIncoming) "получил" else "отправил"} текст \"$text\" $date"
}