package ru.skillbranch.devintensive.models

import java.util.*

class TextMessage(
    id: String,
    from: User?,
    chat: Chat,
    isComing: Boolean = false,
    date: Date = Date(),
    var text: String?
) : BaseMessage(id, from, chat, isComing, date) {
    override fun formatMessage(): String {
        TODO("Not yet implemented")
    }
}