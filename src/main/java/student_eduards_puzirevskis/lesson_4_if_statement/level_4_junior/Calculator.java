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
    public int number;
    public int thirdNumber;

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
    public boolean isEven(int number) {
        if (number % 2 == 1){
            return false;
        } else {
            return true;
        }
    }
    public String maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber>secondNumber) {
            return "firstNumber";
        } else if (firstNumber<secondNumber) {
            return "secondNumber";
        } else {
            return "Numbers are equal";
        }
    }

    public String maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber>secondNumber && firstNumber>thirdNumber) {
            return "firstNumber";
        } else if (secondNumber>firstNumber && secondNumber>thirdNumber) {
            return "secondNumber";
        } else if (thirdNumber>firstNumber && thirdNumber>secondNumber) {
            return "ThirdNumber";
        } else if (firstNumber==secondNumber && firstNumber>thirdNumber){
            return "FirstEqualsSecondAndBiggerThanThird";
        } else if (firstNumber==thirdNumber && firstNumber>secondNumber) {
            return "FirstEqualsThirdAndBiggerThanSecond";
        } else if (secondNumber==thirdNumber && secondNumber>firstNumber) {
            return "SecondEqualsThirdAndBiggerThanFirst";
        } else {
            return "AllAreEqual";
        }

      }
    }

