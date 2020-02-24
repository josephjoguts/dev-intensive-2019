package ru.skillbranch.dev_intensive_2019.models

import java.util.*

class ImageMessage(
    id: String,
    from: User?,
    chat: Chat,
    isIncoming: Boolean = false,
    date: Date = Date(),
    val image: String?
): BaseMessage(id,from,chat,isIncoming,date) {




    override fun formatMessage(): String = "id:$id ${from?.firstName}"+
            " ${if (isIncoming) "получил" else "отправил"} изображение \"$image\" $date"
}