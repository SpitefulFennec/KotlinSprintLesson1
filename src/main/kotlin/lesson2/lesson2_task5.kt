package org.example.lesson2

//Для возведения в степень потребуется дополнительная библиотека (но не вся, поэтому только pow)
import kotlin.math.pow

/*
Формула сложного процента для расчета итоговой суммы: A = P × (1 + r/n)^(n×t),
где A — итоговая сумма, P — начальная сумма, r — годовая процентная ставка,
n — количество периодов начисления процентов в год, а t — срок в годах.
*/

fun main() {

//Инициализируем известные нам значения
    val depositAmount = 70_000
    val interestRate = 0.167
    val frequencyOfAccrualsPerYear = 1
    val depositTermInYears = 20

//Формула слишком длинная и я понятия не имею как она работает. Разбил на 3 части. Скобки 1, скобки 2, остальное
    val firstPartOfCompoundInterestFormula = (1 + interestRate * frequencyOfAccrualsPerYear)
    val secondPartOfCompoundInterestFormula = firstPartOfCompoundInterestFormula.pow(frequencyOfAccrualsPerYear * depositTermInYears)
    val thirdPartOfCompoundInterestFormula = secondPartOfCompoundInterestFormula * depositAmount

//Ну и у результата отрезаем лишние хвосты. Уже делали так в 1 задаче урока
    val resultOfCompoundInterestFormula = String.format("%.3f", thirdPartOfCompoundInterestFormula)

    println(resultOfCompoundInterestFormula)

}