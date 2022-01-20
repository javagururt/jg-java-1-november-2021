package student_stanislav_p.lesson_7_encapsulation.homework.level_5_middle;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class PowerCalculator {

    double multiPower(double firstNumber, int secondNumber) {

        double result;

        if (secondNumber == 0) {
            result = 1;
        } else result = firstNumber;

        for (int i = 1; i < secondNumber; i++) {

            result=result*firstNumber;
        }
        return result;
    }

}
