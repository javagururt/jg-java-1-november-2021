package student_eduards_puzirevskis.lesson_4_if_statement.level_3_junior;

import java.util.Scanner;

/*
Write a program that accepts three numbers from the user and prints:
- "increasing" if the numbers are in increasing order,
- "decreasing" if the numbers are in decreasing order,
- "Neither increasing or decreasing order" otherwise.
 */
class Task_9 {
    public static void main(String[] args) {
        System.out.println("Hi! Let's compare three numbers and decide their order.");
        System.out.println("Please, type first number:");
        Scanner scanner = new Scanner(System.in);
        int userFirstNumber = scanner.nextInt();
        System.out.println("Please, type second number:");
        int userSecondNumber = scanner.nextInt();
        System.out.println("Please, type third number:");
        int userThirdNumber = scanner.nextInt();
        System.out.println("OK. Let me check...");
        if (userFirstNumber<userSecondNumber && userSecondNumber <userThirdNumber) {
            System.out.println("The numbers are increasing.");
        } else if (userFirstNumber>userSecondNumber && userSecondNumber > userThirdNumber) {
            System.out.println("The numbers are decreasing.");
        } else {
            System.out.println("The numbers are Neither increasing or decreasing order.");
        }

    }
}
