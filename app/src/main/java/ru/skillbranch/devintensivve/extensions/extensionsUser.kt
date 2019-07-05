package ru.skillbranch.devintensivve.extensions

import ru.skillbranch.devintensivve.models.User
import ru.skillbranch.devintensivve.models.UserView
import ru.skillbranch.devintensivve.utils.Utilities
import java.util.*

fun User.toUserView():UserView{
    val nickname:String=Utilities.transliteration("$firstName $lastName")
    val initials:String=""
    val status=if (lastVisit==null)"Еще ни разу не был" else if(isOnline)"Онлайн" else "Последний раз был ${lastVisit.humanizeDiff()}"
    return UserView(
        id=id,
        fullName= "$firstName $lastName",
        avatar=avatar,
        nickname = nickname,
        initials = initials,
        status =status


    )
}

 fun Date.humanizeDiff(date: Date=Date()): String {
     println(this.time)
     println(date.time)
     return (this.time-date.time).toString()
}
