package student_dima_talanov.lesson_4.level_2_intern;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int holeNumber1;
        int holeNumber2;
        System.out.println("Enter the hole number:");
        holeNumber1 = num.nextInt();
        holeNumber2 = num.nextInt();

        if (holeNumber1 == holeNumber2) {
            System.out.println("Numbers are equals");

        } else {
            System.out.println("Numbers are different");
        }
    }
}


