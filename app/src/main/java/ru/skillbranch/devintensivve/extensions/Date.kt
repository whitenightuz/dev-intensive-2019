package ru.skillbranch.devintensivve.extensions

import java.text.SimpleDateFormat
import java.util.*



const val SECOND=1000L
const val MINUTE=60* SECOND
const val HOUR=60* MINUTE
const val DAY=24* HOUR


fun Date.format(pattern: String = "HH.mm.ss dd.MM.yy"): String =
    SimpleDateFormat(pattern, Locale("ru"))
        .format(this)

fun Date.add(value: Int, units: TimeUnits= TimeUnits.SECONDS):Date {
    var time=this.time
        time+= when(units){
            TimeUnits.SECONDS->value* SECOND
            TimeUnits.MINUTES->value* MINUTE
            TimeUnits.HOURS->value* HOUR
            TimeUnits.DAY->value* DAY
           }
    this.time=time
    return this
}
enum class TimeUnits{
    SECONDS,
    MINUTES,
    HOURS,
    DAY
}
