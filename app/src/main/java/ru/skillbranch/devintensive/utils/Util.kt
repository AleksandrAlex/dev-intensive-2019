package ru.skillbranch.devintensive.utils

import ru.skillbranch.devintensive.models.User

object Util {
    fun parseFullName(fullName :String?): Pair<String?, String?>{
        val nameParts = fullName?.split(" ")
        val firstName = nameParts?.get(0)
        val lastName = nameParts?.get(1)
        return firstName to lastName
    }
}