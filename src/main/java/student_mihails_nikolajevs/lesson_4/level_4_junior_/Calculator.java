package student_mihails_nikolajevs.lesson_4.level_4_junior_;
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
public class Calculator {


    public int sum(int firstNumber, int secondNumber) {

        return firstNumber + secondNumber;
    }

    public int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int multi(int firstNumber, int secondNumber) {

        return firstNumber * secondNumber;
    }

    public int div(int firstNumber, int secondNumber) {

        return firstNumber / secondNumber;
    }

    public boolean isEven(int Number) {
        if (Number % 2 == 0) {
            return true;
        } else return false;
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else if (firstNumber < secondNumber) {
            return secondNumber;
        } else {
            return firstNumber;

        }
    }

}