package student_mihails_nikolajevs.lesson_4.level_3_junior_;
/*
Write a program that accepts three numbers from the user and prints:
- "increasing" if the numbers are in increasing order,
- "decreasing" if the numbers are in decreasing order,
- "Neither increasing decreasing order" otherwise".

 */

import java.util.Scanner;
public class Task9_ {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter First Number : ");
        int number1 = scanner.nextInt();
        System.out.println("Please Enter Second Number : ");
        int number2 = scanner.nextInt();
        System.out.println("Please Enter Third Number : ");
        int number3 = scanner.nextInt();

        if (number1 < number2 && number1 < number3) {
            System.out.println("Increasing");
        } else if (number1 > number2 && number2 > number3) {
            System.out.println("Decreasing");
        } else {
            System.out.println( "Neither increasing or decreasing order" );

        }

    }

}
