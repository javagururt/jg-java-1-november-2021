//Добавьте в класс Calculator метод для определения
//максимального из трёх целых чисел.
//
//Добавьте в класс CalculatorTest тесты для этого метода.
//Тесты должны покрывать следующие тестовые сценарии:
//- первое число больше второго и третьего
//- второе число больше первого и третьего
//- третье число больше первого и второго
//- первые два равны и больше третьего
//- ...
//- три числа равны
//По одному тесту на каждый из сценариев!

package student_dima_talanov.lesson_4.level_4_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
 class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtraction(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int multiplication(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int division(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public int parity(int firstNumber) {
        return firstNumber % 2;
    }

    public int maxOrEqualOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else if (secondNumber > firstNumber) {
            return secondNumber;
        } else {
            return secondNumber | firstNumber;
        }
    }

    public int maxOrEqualOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            return firstNumber;
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            return secondNumber;
        } else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
            return thirdNumber;
        } else if (firstNumber == secondNumber && firstNumber > thirdNumber) {
            return firstNumber | secondNumber;
        } else if (secondNumber == thirdNumber && secondNumber > firstNumber) {
            return secondNumber | thirdNumber;
        } else if (thirdNumber > secondNumber) {
            return firstNumber | thirdNumber;
        } else {
            return (firstNumber | secondNumber | thirdNumber);
        }
    }
}