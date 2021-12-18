package student_dima_talanov.lesson_4.level_1_intern;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int holeNumber;
        System.out.println("Enter the hole number:");
        holeNumber = num.nextInt();

        if (holeNumber > 0)  {
            System.out.println("This is a positive number.");

        } else if (holeNumber < 0) {
            System.out.println("This is a negative number.");

        } else if (holeNumber == 0) {
            System.out.println("Number is 0");
        }
    }
}

