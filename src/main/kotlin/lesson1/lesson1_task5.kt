package org.example.lesson1

const val SECONDS_IN_MINUTE = 60
const val MINUTES_IN_HOUR = 60

fun main() {

    val totalSeconds = 6480
    val minutes = totalSeconds / SECONDS_IN_MINUTE % MINUTES_IN_HOUR
    val hours = totalSeconds / SECONDS_IN_MINUTE / MINUTES_IN_HOUR
    val seconds = totalSeconds % SECONDS_IN_MINUTE

    val result = String.format("%02d:%02d:%02d", hours, minutes, seconds)
    println(result)

}