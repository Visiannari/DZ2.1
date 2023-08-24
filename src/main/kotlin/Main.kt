fun main() {
    val seconds =1320
    val minutes = (seconds / 60)
    val hours = (minutes / 60)


    fun variant1(seconds: Int) = when {
        minutes % 100 == 11 -> println("Был в сети ${minutes} минут назад")
        minutes % 10 == 1 -> println("Был в сети ${minutes} минуту назад")
        minutes % 100 == 12 -> println("Был в сети  ${minutes} минут назад")
        minutes % 100== 13 -> println("Был в сети  ${minutes} минут назад")
        minutes % 100 == 14 -> println("Был в сети  ${minutes} минут назад")
        minutes % 10 == 2 -> println("Был в сети  ${minutes} минуты назад")
        minutes % 10 == 3 -> println("Был в сети  ${minutes} минуты назад")
        minutes % 10 == 4 -> println("Был в сети  ${minutes} минуты назад")

        else -> println("Был в сети ${minutes} минут назад")
    }

    fun variant2(seconds: Int) = when {
        hours % 100 == 11 -> println("Был в сети ${hours} часов назад")
        hours % 10 == 1 -> println("Был в сети ${hours} час назад")
        hours % 100 > 20 -> println("Был в сети ${hours} часa назад")
        hours % 100 < 5 -> println("Был в сети  ${hours} часа назад")
        else -> println("Был в сети ${hours} часов назад")
    }
    when {
        seconds < 61 -> println("Был в сети только что")
        seconds < 3600 -> variant1(seconds)
        seconds < 86400 -> variant2(seconds)
        seconds < 172800 -> println("Был в сети вчера")
        seconds < 259200 -> println("Был в сети позавчера")
        else -> println("Был в сети давно")
    }
}

