package ru.vdh.myapp

import java.text.SimpleDateFormat
import java.util.Locale

object DateUtils {
    fun getCurrentDate(currentTime: Long): String? {
        return SimpleDateFormat("dd.MM.yyyy", Locale.getDefault()).format(currentTime)
    }
}