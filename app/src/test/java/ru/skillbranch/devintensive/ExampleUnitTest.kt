package ru.skillbranch.devintensive

import org.junit.Test

import org.junit.Assert.*
import ru.skillbranch.devintensive.extentions.add
import ru.skillbranch.devintensive.extentions.format
import ru.skillbranch.devintensive.extentions.toInitials
import ru.skillbranch.devintensive.models.BaseMessage
import ru.skillbranch.devintensive.models.Chat
import ru.skillbranch.devintensive.models.TextMessage
import ru.skillbranch.devintensive.models.User
import java.util.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun test_instance(){
        val user = User("1")
        val user2 = User("2", "John", "Wick")
        val user3 = User("3", "John", "Silverhand", null, lastVisit = Date(), isOnline = true)

        user.printMe()
        user2.printMe()
        user3.printMe()

        println("$user $user2 $user3")
    }

    @Test
    fun test_user_factory(){
        val user = User.makeUser("Chuck Norris")
        val user2 = User.makeUser("Tom Cruise")
    }

    @Test
    fun test_message_factory(){
        val user = User.makeUser("Chuck Norris")
        val textMessage = BaseMessage.makeMessage(user, Chat("0"), Date(), "text", "Payload TextMessage!")
        val imageMessage = BaseMessage.makeMessage(user, Chat("1"), Date(), "image", "Payload ImageMessage!")
    }

    @Test
    fun test_data_format(){
        val user = User.makeUser("Chuck Norris")
        val user2 = user.copy(lastVisit = Date())
        println(user2.lastVisit?.format())
    }

    @Test
    fun test_data_add(){
        val user = User.makeUser("Chuck Norris")
        val user2 = user.copy(lastVisit = Date())
        val user3 = user2.copy(lastVisit = Date().add(4, "second"))

        println(user.lastVisit)
        println(user2.lastVisit)
        println(user3.lastVisit)
    }

    @Test
    fun test_get_initials(){
        val user = User.makeUser("Chuck Norris")
        println(user.toInitials())
    }
}