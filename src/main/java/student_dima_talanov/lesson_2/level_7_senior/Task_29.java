// Исправьте ошибки компиляции в данной программе.

package student_dima_talanov.lesson_2.level_7_senior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task_29 {


    static class SumTwoNumbers {

    public static void main(String[] args) {
    int numberOne = 10;
    int numberTwo = 20;

    System.out.println("Number 1 = " + numberOne);
    System.out.println("Number 2 = " + numberTwo);

    int sum = numberOne + numberTwo;

    System.out.println("Sum = " + sum);
    }
}
}