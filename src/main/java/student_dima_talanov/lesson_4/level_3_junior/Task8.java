//Write a Java program that accepts three numbers and prints:
// -"All numbers are equal" if all three numbers are equal,
// - "All numbers are different" if all three numbers are different
// - "Neither all are equal or different" otherwise.


package student_dima_talanov.lesson_4.level_3_junior;

import java.util.Scanner;

public class Task8 {

    public static void main(String[] arg) {
        Scanner num = new Scanner(System.in);
        int number1;
        int number2;
        int number3;
        System.out.println("Enter the number:");
        number1 = num.nextInt();
        System.out.println("Enter the number:");
        number2 = num.nextInt();
        System.out.println("Enter the number:");
        number3 = num.nextInt();

        if (number1 == number2 && number2 == number3) {
            System.out.println("All numbers are equal");
            } else if  (number2 != number3 && number1 != number3 && number1 != number2) {
            System.out.println("All numbers are different");
            } else {
            System.out.println("Neither all are equal or different");
            }
    }
}
