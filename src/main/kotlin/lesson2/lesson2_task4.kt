package org.example.lesson2

const val TOTAL_PERCENT = 100

fun main() {

//Записываем известные переменные, то есть процент от баффа и количество добытой руды
    val buffPercentage = 20
    val minedCristalOre = 7
    val minedIronOre = 11

//Вычисляем сколько бонусной руды мы добыли, сразу отображаем в консоли
    val buffForMinedCristalOre = minedCristalOre * buffPercentage / TOTAL_PERCENT
    println("ВЫ добыли дополнительно $buffForMinedCristalOre кристальной руды")

    val buffForMinedIronOre = minedIronOre * buffPercentage / TOTAL_PERCENT
    println("Вы добыли дополнительно $buffForMinedIronOre железной руды")

}

//Поскольку все значения у нас в Int, не требуется ничего дополнительно форматировать