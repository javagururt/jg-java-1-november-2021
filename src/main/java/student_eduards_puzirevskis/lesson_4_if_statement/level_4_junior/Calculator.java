package student_eduards_puzirevskis.lesson_4_if_statement.level_4_junior;

import java.util.Scanner;

/*
Создайте класс Calculator. В этом классе создайте методы
для сложения, вычитания, деления и умножения двух целых чисел.

Подсказка:

class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    // реализуйте по аналогии оставшиеся методы

}
 */
class Calculator {
    public int firstNumber;
    public int secondNumber;

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
    public int subtraction(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
    public int reverseSubtraction(int firstNumber, int secondNumber) {
        return secondNumber - firstNumber;
    }
    public int division(int firstNumber, int secondNumber) {
        return (firstNumber/secondNumber);
    }
    public int reverseDivision( int firstNumber, int secondNumber) {
        return (secondNumber/firstNumber);
    }
    public int multiplication( int firstNumber, int secondNumber) {
        return (firstNumber*secondNumber);
    }
}
