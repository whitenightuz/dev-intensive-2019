package ru.skillbranch.devintensivve

import org.junit.Test

import org.junit.Assert.*
import ru.skillbranch.devintensivve.extensions.TimeUnits
import ru.skillbranch.devintensivve.extensions.add
import ru.skillbranch.devintensivve.extensions.format
import ru.skillbranch.devintensivve.extensions.humanizeDiff
import ru.skillbranch.devintensivve.models.User
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
    fun test_function() {
        val user = User.makeUser("Islam Akhrarov")
        User.makeUser("Bob Konnov")
        User.makeUser("Sardor Gudov")
        val user2 = user.copy(id = "2", lastName = "Bakhodirov")
        println(user)
        println(user2)


    }

    @Test
    fun test_decomposition() {
        val user = User.makeUser("Islam Akhrarov")
        fun getInfoUser() = user
        val (id, firstName) = getInfoUser()
        println(id)
        println(firstName)
        println(user.component6())
        println(user.component2())
        println(user.component3())
    }

    @Test
    fun test_copy() {
        val user = User.makeUser("Islam Akhrarov")
        val user2 = user.copy("8", lastVisit = Date())
        val user3 = user2.copy()

        if (user == user2) {
            println("equals data and hash $user ${user.hashCode()}\nto $user2 ${user2.hashCode()}")
        } else {
            println("not equals data and hash $user ${user.hashCode()}\n to $user2 ${user2.hashCode()}")

        }
        if (user === user2) {
            println("equals address ${System.identityHashCode(user)}  ${System.identityHashCode(user2)}")
        } else {
            println("not equals address  ${System.identityHashCode(user)}  ${System.identityHashCode(user2)}")

        }


    }
    @Test
    fun test_time(){

        val user = User.makeUser("Islam Akhrarov")
        val user2 = user.copy("8", lastVisit = Date(),firstName = "Bobur",lastName = "Bakhodirov")
        val user3 = user2.copy(firstName = "Ildar",lastName = "Galiulin",lastVisit = Date().add(2,TimeUnits.MINUTES))
        println("""
            ${user.lastVisit}
            ${user2.lastVisit?.add(-2,TimeUnits.MINUTES)!!.format()}
            ${user3.lastVisit?.humanizeDiff()}
        """.trimIndent())


    }
}
