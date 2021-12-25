package student_stanislav_p.lesson_4_if_statement.level_4_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Calculator {

    int sum(int firstNumber, int secondNumber) {

        return firstNumber + secondNumber;
    }

    int sub(int firstNumber, int secondNumber) {

        return firstNumber - secondNumber;
    }

    int multi(int firstNumber, int secondNumber) {

        return firstNumber * secondNumber;
    }

    int div(int firstNumber, int secondNumber) {

        return firstNumber / secondNumber;
    }

    boolean isEven (int Number) {
        if (Number % 2 == 0) {
            return true;}
        else {
            return false;
        }
    }

    int maxOf2Number(int firstNumber, int secondNumber) {

        if (firstNumber > secondNumber) {
            return firstNumber;

        } else if (secondNumber > firstNumber) {
            return secondNumber;

        } else {
            return firstNumber;
        }
    }

    int maxOf3Number(int firstNumber, int secondNumber, int thirdNumber) {

        if (firstNumber>= secondNumber && firstNumber >= thirdNumber) {
            return firstNumber;

        } else if (secondNumber>= firstNumber && secondNumber >= thirdNumber) {
            return secondNumber;

        } else if (thirdNumber >= firstNumber && thirdNumber >= secondNumber) {
            return thirdNumber;
        } else {
            return 0;
        }
    }
}
