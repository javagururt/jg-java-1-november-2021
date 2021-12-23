package student_valeriia_kulikova.lesson_4_if_statement.homework.level_4_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Calculator {
    public int sum (int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
    public int sub (int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
    public int multi (int firstNumber, int secondNumber) {
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
