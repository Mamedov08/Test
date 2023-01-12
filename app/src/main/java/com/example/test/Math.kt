package com.example.test

class Math {

    fun add(a: String, b: String): String {
        var result = ""
        if (a.isNumeric() && b.isNumeric()) {
            result = (a.toDouble() + b.toDouble()).toString()
        } else if (a.isEmpty() || b.isEmpty()) {
            result = "Вы не заполнили поля"
        } else{
            result = "Вы ввели буквы"
        }
        return result

    }
    fun divide (a: String, b: String): String {
        var result = ""
        if (!a.isNumeric() && !b.isNumeric()) {
            result = "Вы ввели буквы"
        } else if (a.isEmpty() || b.isEmpty()) {
            result = "Вы не заполнили поля"
        }else if (b == "0.0") {
            result = "Нельзя делить на ноль"
        } else{
            result = (a.toDouble() / b.toDouble()).toString()

        }
        return result
    }
     fun String.isNumeric(): Boolean {
        val reqex = "-?[0-9] + (\\.[0-9] +)?".toRegex()
        return this.matches(reqex)

    }
}