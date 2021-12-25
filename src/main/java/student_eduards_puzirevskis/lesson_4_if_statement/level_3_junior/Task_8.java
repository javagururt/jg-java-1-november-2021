package student_eduards_puzirevskis.lesson_4_if_statement.level_3_junior;

import java.util.Scanner;

import teacher.annotations.CodeReview;

/*
Write a Java program that accepts three numbers and prints:
 -"All numbers are equal" if all three numbers are equal,
 - "All numbers are different" if all three numbers are different
 - "Neither all are equal or different" otherwise.
 */
@CodeReview(approved = true)
class Task_8 {
    public static void main(String[] args) {
        System.out.println("Hi! Let's compare three numbers and decide, are they equal or not");
        System.out.println("Please, type first number:");
        Scanner scanner = new Scanner(System.in);
        int userFirstNumber = scanner.nextInt();
        System.out.println("Please, type second number:");
        int userSecondNumber = scanner.nextInt();
        System.out.println("Please, type third number:");
        int userThirdNumber = scanner.nextInt();
        System.out.println("OK. Let me check...");
        if (userFirstNumber == userSecondNumber && userSecondNumber == userThirdNumber) {
            System.out.println("All numbers are equal");
        } else if (userFirstNumber != userSecondNumber && userSecondNumber != userThirdNumber && userFirstNumber != userThirdNumber) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }

    }
}
