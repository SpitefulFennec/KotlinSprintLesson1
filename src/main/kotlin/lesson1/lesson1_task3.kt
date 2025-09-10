package org.example.lesson1

fun main() {
    val year = "1961"
    var hour = "9"
    var minute = "7"
    println(year)
    println(hour)
    println(minute)

    hour = "10"
    minute = "55"
    print(hour)
    print(":")
    print(minute)

    /* BTW, в условиях задачи не сказано, что во второй раз нужно инициировать переменные по отдельности,
поэтому можно сделать и через println(hour + ":" + minute) и через println("$hour:$minute")
*/
}