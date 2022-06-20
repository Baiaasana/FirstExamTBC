package com.example.firstexam

class Math {

    fun lcd(number1: Int, number2: Int): String {

        val n1 = if (number1 > 0) number1 else -number1
        val n2 = if (number2 > 0) number2 else -number2

        var lcd = 1
        var i = 1
        while (i <= n1 && i <= n2) {

            if (n1 % i == 0 && n2 % i == 0)
                lcd = i
            i++
        }
        return "უ.ს.გ ($number1; $number2) = $lcd"
    }


    fun lcm(n1: Int, n2: Int): String {

        val biggerNumber = if (n1 > n2) n1 else n2
        var lcm = biggerNumber
        while (true) {

            if (((lcm % n1) == 0) && ((lcm % n2) == 0)) {
                break
            }
            lcm += biggerNumber
        }
        return "უ.ს.ჯ($n1, $n2) = $lcm"
    }

    fun checkString(str: String): String {

        return if (str.contains("$")) "$str contains '$'."
        else "$str does not contains '$'."

    }

    fun sumOfEven(): Int {

        val list = (0..100).toList()
        var sum = 0

        list.forEach() {

            if (it % 2 == 0) sum += it
        }
        return sum
    }

    fun reverse(num: Int): Int{

        val num2 = num.toString().reversed()
        return num2.toInt()
    }

    fun checkPolyndrom(str: String): String{

        if (str == str.reversed()) return  "$str is polyndrom."
        return "$str is polyndrom"

    }

    fun recursionSumEven(num: Int): Int {
        if (num != 0)
            return num + recursionSumEven(num - 2)
        else
            return num
    }

}




