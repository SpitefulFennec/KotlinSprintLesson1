package org.example.lesson2

fun main() {

//Записываем известные значения по числу работников
    val sumOfFullTimeEmployees = 50
    val sumOfInterns = 30

//Сразу вычисляем сумму всех работников
    val sumOfEmployees = sumOfFullTimeEmployees + sumOfInterns

//Записываем известные значения зарплат (могли бы быть и побольше)
    val fullEmployeeSalary = 30000
    val internSalary = 20000

//Вычисляем ЗП для работников, затем выводим в консоль
    val paymentForFullEmployees = sumOfFullTimeEmployees * fullEmployeeSalary
    val resultPaymentForFullEmployees = paymentForFullEmployees.toInt()
    println(resultPaymentForFullEmployees)

//Вычисляем ЗП интернов для использования дальше
    val paymentForInterns = sumOfInterns * internSalary

//Вычисляем сумму выплат ЗП по всем работникам и стажёрам, выводим в консоль
    val sumOfPayments = paymentForFullEmployees + paymentForInterns
    val resultSumOfPayments = sumOfPayments.toInt()
    println(resultSumOfPayments)

//Вычисляем среднюю ЗП по работникам, выводим в консоль
    val averageEmployeeSalary = sumOfPayments / sumOfEmployees
    val resultAverageEmployeeSalary = averageEmployeeSalary.toInt()
    println(resultAverageEmployeeSalary)

//По условиям задачи вывод должен быть целочисленный,
//поэтому были созданы переменные result с конвертацией результата в Int.

}