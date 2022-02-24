package student_artyom_shvegzhda.lesson_2_variables.homework.level_1_intern;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task_2 {
    public static void main(String[] args) {
        System.out.println("Please enter two non-round numbers: ");
        Scanner scanner = new Scanner(System.in);
        double firstDoubleNumber = scanner.nextDouble();
        double secondDoubleNumber = scanner.nextDouble();

        double sumIs = firstDoubleNumber + secondDoubleNumber;
        double subIs = firstDoubleNumber - secondDoubleNumber;
        double divideIs = firstDoubleNumber / secondDoubleNumber;
        double multiplyIs = firstDoubleNumber * secondDoubleNumber;

        System.out.println("Sum is :" + sumIs);
        System.out.println("Subtraction is: " + subIs);
        System.out.println("Divide is: " + divideIs);
        System.out.println("Multiply is: " + multiplyIs);
    }
}
