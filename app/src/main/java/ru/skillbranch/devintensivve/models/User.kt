package ru.skillbranch.devintensivve.models

import ru.skillbranch.devintensivve.utils.Utilities
import java.util.*

data class User(
    val id: String,
    var firstName: String?,
    var lastName: String?,
    var avatar: String?,
    var rating: Int = 0,
    var respect: Int = 0,
    val lastVisit: Date? = null,
    val isOnline: Boolean = false

) {

    constructor(id: String, firstName: String?, lastName: String?) : this(
        id,
        firstName,
        lastName,
        null
    )

    constructor(id: String) : this(id, "John", "Smith")

    init {
        println(
            "It is lIfe, his name is ${if (lastName == "Smith") "$firstName,$lastName" else "$firstName,$lastName "}\n"

        )
    }

    fun getIt() = """
        sdfdsgfdg
        fsdgsdgdgd
        \n 
        ${"\n\n\n"}
        fgfhg
    """.trimIndent()

    fun printMe() {
        println(
            """
            id: $id: 
            firstName:$firstName:
            lastName: $lastName: 
            avatar: $avatar: 
            rating: $rating: 
            respect:$respect:
            lastVisit:$lastVisit:
            isOnline: $isOnline: 
        """.trimIndent()
        )
    }

    companion object Factory {
        var lastId = -1
        fun makeUser(fullName: String?): User {
            lastId++
          val (firstName,lastName)=Utilities.parseFullname(fullName)
            return User(id = lastId.toString(), firstName = firstName, lastName = lastName)

        }
    }

}