package student_rolands_gudels.lesson4_if_statement.level_4_junior;

public class Task_11 {
    /*Создайте класс Calculator. В этом классе создайте методы
для сложения, вычитания, деления и умножения двух целых чисел.

Подсказка:*/

    static class Calculator {
        public int sum(int firstNumber, int secondNumber) {
            return firstNumber + secondNumber;
        }

        public int substraction(int firstNumber, int secondNumber) {
            return firstNumber - secondNumber;
        }

        public int division(int firstNumber, int secondNumber) {
            return firstNumber / secondNumber;
        }

        public int multiplication(int firstNumber, int secondNumber) {
            return firstNumber * secondNumber;
        }

        public boolean isEven(int number) {
            if (number % 2 == 0) {
                return true;
            } else {
                return false;
            }
        }

    }
}

