package org.example.lesson2

fun main() {
// Инициализируем баллы 4 студентов
    val scoreStudentOne = 3.0
    val scoreStudentTwo = 4.0
    val scoreStudentThree = 3.0
    val scoreStudentFour = 5.0

//добавляем в явном виде количество студентов
    val sumOfStudents = 4

//Вычисляем среднее арифметическое (сложить оценки студентов, разделить на их количество)
    val arithmeticMeanScore = (scoreStudentOne + scoreStudentTwo + scoreStudentThree +scoreStudentFour) / sumOfStudents
//Баллы студентов изначально в формате Double, поэтому результат так же будет в Double

//Поскольку нужен результат с округлением до 2 знаков после запятой, добавляем такое форматирование
    val twoDecimalResult = String.format("%.2f", arithmeticMeanScore)

//Выводим результат в консоль
    println(twoDecimalResult)

}