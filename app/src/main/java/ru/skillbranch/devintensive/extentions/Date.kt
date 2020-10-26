package ru.skillbranch.devintensive.extentions

import ru.skillbranch.devintensive.models.User
import java.lang.IllegalStateException
import java.text.SimpleDateFormat
import java.util.*

const val SECOND = 1000L
const val MINUTES = 60 * SECOND
const val HOUR = 60 * MINUTES
const val DAY = 24 * HOUR

fun Date.format(pattern: String = "HH:mm:ss dd.MM.yy"): String {
    val dataFormat = SimpleDateFormat(pattern, Locale("ru"))
    return dataFormat.format(this)
}

fun Date.add(value: Int, units: String): Date {
    var time = this.time

    time += when (units) {
        "second" -> value * SECOND
        "minutes" -> value * MINUTES
        "hour" -> value * HOUR
        "day" -> value * DAY
        else -> throw IllegalStateException("Error!")
    }
    this.time = time
    return this
}

fun User.toInitials(): Pair<Char?, Char?> {
    val firstName = this.firstName
    val lastName = this.lastName

    return firstName?.get(0) to lastName?.get(0)

}