package student_vladislav_savickis.lesson_2_variables.level_7_senior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class CorrectDataTypes {
    public static void main(String[] args) {

        int numberOne = 10;
        double numberTwo = 20.0;
        double sum;

        System.out.println("Number 1 = " + numberOne);
        System.out.println("Number 2 = " + numberTwo);

        sum = (double) numberOne + numberTwo;

        System.out.println("Sum = " + sum);
    }
}
