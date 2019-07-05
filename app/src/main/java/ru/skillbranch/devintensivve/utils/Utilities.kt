package ru.skillbranch.devintensivve.utils

import android.service.voice.AlwaysOnHotwordDetector

object Utilities {
    fun parseFullname(fullName: String?): Pair<String?, String?> {
        val parts: List<String>? = fullName?.split(" ")
        val firstName = parts?.getOrNull(0)
        val lastName = parts?.getOrNull(1)
        return firstName to lastName
        // return Pair(firstName,lastName)
    }

    fun transliteration(payload: String,divider:String=" "): String {

       TODO()
    }
}