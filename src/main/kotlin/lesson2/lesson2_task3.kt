package org.example.lesson2

const val MINUTES_IN_HOUR = 60
const val HOURS_IN_MINUTE = 60
const val HOURS_IN_DAYS = 24

fun main() {

//Принимаем время отправления
    val departureHours = 9
    val departureMinutes = 39

//Конвертируем его в общее количество минут
    val totalMinutesOfDeparture = departureHours * HOURS_IN_MINUTE + departureMinutes

//Записываем время в пути
    val minutesInTrip = 2457

//Складываем время старта и время в пути, чтобы узнать время прибытия в минутах
    val totalMinutesArrival = totalMinutesOfDeparture + minutesInTrip

//Конвертируем эти минуты в фактическое время прибытия, с поправкой на смену дня
    val arrivalMinutes = totalMinutesArrival % MINUTES_IN_HOUR
    val arrivalHours = totalMinutesArrival / MINUTES_IN_HOUR % HOURS_IN_DAYS

//Выводим в консоль время прибытия
    val timeOfArrival = String.format("%02d:%02d", arrivalHours, arrivalMinutes)
    println(timeOfArrival)

}