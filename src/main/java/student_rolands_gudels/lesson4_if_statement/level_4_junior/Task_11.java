package student_rolands_gudels.lesson4_if_statement.level_4_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
 class Task_11 {
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
        public void SomethingWentWrong(){
            System.out.print("Something went wrong or some numbers are the same ");
        }
        public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
            if (firstNumber > secondNumber) {
                return firstNumber;
            } else if (firstNumber < secondNumber) {
                return secondNumber;
            } else SomethingWentWrong();
        return 0;}

        public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
            if (firstNumber > secondNumber & firstNumber>thirdNumber) {
                return firstNumber;
            } else if (secondNumber>firstNumber & secondNumber>thirdNumber) {
                return secondNumber;
            } else if (thirdNumber>firstNumber & thirdNumber>secondNumber){
                return thirdNumber;
            } else SomethingWentWrong();
            return 0;
        }
        }


    }


