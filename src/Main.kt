fun main() {
    println("Введите первую цифру:")
    val firstDigit = readLine()?.toIntOrNull()

    println("Введите вторую цифру:")

    val secondDigit = readLine()?.toIntOrNull()
    if (firstDigit == null || secondDigit == null) {
        println("Ошибка: необходимо ввести цифры")
        return
    }

    if (firstDigit == secondDigit) {
        println("Цифры должны быть различны")
        return
    }

    if (firstDigit !in 0..9 || secondDigit !in 0..9) {
        println("Ошибка: необходимо ввести цифры от 0 до 9")
        return
    }
    val result = findOddNumber(firstDigit, secondDigit)
    if (result != null) {
        println("Результат: $result")
    } else {
        println("Создать нечетное число невозможно")
    }
}
fun findOddNumber(digit1: Int, digit2: Int): Int? {
    val number1 = digit1 * 10 + digit2
    val number2 = digit2 * 10 + digit1
    if (number1 % 2 != 0) {
        return number1
    } else if (number2 % 2 != 0) {
        return number2
    }
    return null
}