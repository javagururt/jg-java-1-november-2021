package student_dima_talanov.lesson_2.level_7_senior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task_30 {

    static class CorrectDataTypes {

        public static void main(String[] args){
        int numberOne = 10;
        double numberTwo = 20.0;

        System.out.println("Number 1 = " + numberOne);
        System.out.println("Number 2 = " + numberTwo);

        double sum = (numberOne + numberTwo);
        System.out.println("Sum =" + sum);
    }
}
}