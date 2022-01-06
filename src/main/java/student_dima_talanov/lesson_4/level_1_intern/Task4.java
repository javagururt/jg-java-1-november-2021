package student_dima_talanov.lesson_4.level_1_intern;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task4 {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int number;
        int result;
        System.out.println("Enter the hole number:");
        number = num.nextInt();
        result = (number % 2);

        if (result == 0) {
            System.out.println("Even");

        } else {
            System.out.println("Not even");
        }
    }
}