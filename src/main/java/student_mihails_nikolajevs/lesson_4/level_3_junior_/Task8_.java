package student_mihails_nikolajevs.lesson_4.level_3_junior_;
/*
Write a Java program that accepts three numbers and prints:
 -"All numbers are equal" if all three numbers are equal,
 - "All numbers are different" if all three numbers are different
 - "Neither all are equal  different" otherwise.
 */

import java.util.Scanner;

public class Task8_ {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter First Number : ");
        int number1 = scanner.nextInt();
        System.out.println("Please Enter Second Number : ");
        int number2 = scanner.nextInt();
        System.out.println("Please Enter Third Number : ");
        int number3 = scanner.nextInt();

        if (number1 == number2 && number1 == number3) {
            System.out.println("All Numbers are Equals");
        } else if (number1 != number2 && number2 != number3 && number1 != number3) {
            System.out.println(" All Numbers are different ");
        } else {
           System.out.println( "Neither all are equal or different" );

        }
    }
}