package student_eduards_puzirevskis.lesson_4_if_statement.level_1_intern;

import java.util.Scanner;

/*
Написать программу, которая запрашивает у пользователя
целое число и выводит на консоль
положительное оно, отрицательное или равно нулю.
 */
class Task_2 {
    public static void main(String[] args) {

            System.out.println("Hi! Let's check something II ...");
            System.out.println("Please, enter any integer.");
            Scanner scanner = new Scanner(System.in);
            int userNumber = scanner.nextInt();
            if (userNumber < 0) {
                System.out.println("Your number (" + userNumber + ") is negative");
            } else if (userNumber > 0) {
                System.out.println("Your number " + userNumber + " is positive");
            } else  {
                System.out.println("Hey, I gotcha, you little cheater! Your number is 0 ");
            }

    }
}
