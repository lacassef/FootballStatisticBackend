package codigomz.footballstatisticbackend.util

import java.util.*

fun getDayString(it: Int): String {
    val date = Date(it.toLong()*1000)
    val calendar = Calendar.Builder().setInstant(date).build()
    val day = calendar.get(Calendar.DATE)
    val month = calendar.get(Calendar.MONTH)+1
    val year = calendar.get(Calendar.YEAR)
    return "${if(day<10) "0${day}" else day}/${if(month.toString().length<2) "0${month}" else month}/${year}"
}
fun getDayString(it: Long): String {
    val date = Date(it)
    val calendar = Calendar.Builder().setInstant(date).build()
    val day = calendar.get(Calendar.DATE)
    val month = calendar.get(Calendar.MONTH)+1
    val year = calendar.get(Calendar.YEAR)
    return "${if(day<10) "0${day}" else day}/${if(month.toString().length<2) "0${month}" else month}/${year}"
}

fun getTimeString(it: Int): String{
    val date = Date(it.toLong()*1000)
    val calendar = Calendar.Builder().setInstant(date).build()
    val hour = calendar.get(Calendar.HOUR_OF_DAY)
    val minute = calendar.get(Calendar.MINUTE)
    return "${if(hour>=10) hour
    else "0${hour}"}:${if (minute >= 10) minute else "0$minute"}"
}

fun getDate(timestamp: Long): String {
    val date = Date(timestamp)
    val calendar = Calendar.Builder().setInstant(date).build()
    val day = calendar.get(Calendar.DATE)
    return "${if(day<10) "0${day}" else day}"
}
fun getMonth(timestamp: Long): String {
    val date = Date(timestamp)
    val calendar = Calendar.Builder().setInstant(date).build()
    val day = calendar.get(Calendar.MONTH)+1
    return "${if(day<10) "0${day}" else day}"
}
fun getYear(timestamp: Long): String {
    val date = Date(timestamp)
    val calendar = Calendar.Builder().setInstant(date).build()
    val day = calendar.get(Calendar.YEAR)
    return "${if(day<10) "0${day}" else day}"
}