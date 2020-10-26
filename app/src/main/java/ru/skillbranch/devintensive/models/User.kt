package ru.skillbranch.devintensive.models

import ru.skillbranch.devintensive.utils.Util
import java.util.*

data class User (
    val id: String,
    var firstName: String?,
    var lastName: String?,
    var avatar: String?,
    var rating: Int = 0,
    var respect: Int = 0,
    val lastVisit: Date? = null,
    val isOnline: Boolean = false
) {
    constructor(id: String, firstName: String?, lastName: String?): this(id, firstName, lastName, null)

    constructor(id: String): this(id, "John", "Doe $id")

    init {
        println("It's Alive!!! \nThe name is $firstName and last name is $lastName")
    }

    fun printMe() =
        println("""
                id: $id
                firstName: $firstName
                lastName: $lastName
                avatar: $avatar
                rating: $rating
                respect: $respect
                lastVisit: $lastVisit
                isOnline: $isOnline
        """.trimIndent())

    companion object UserFactory {
        private var lastId = -1
        fun makeUser (fullName: String?): User{
            lastId++
            val (firstName, lastName) = Util.parseFullName(fullName)
            return User("$lastId", firstName, lastName)
        }

    }
}