package student_dima_talanov.lesson_4.level_2_intern;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task5 {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int holeNumber1;
        int holeNumber2;
        System.out.println("Enter the hole number:");
        holeNumber1 = num.nextInt();
        System.out.println("Enter the hole number:");
        holeNumber2 = num.nextInt();
        System.out.println("Number:");

        if (holeNumber1 > holeNumber2) {
            System.out.println(holeNumber1);

        } else {
            System.out.println(holeNumber2);
        }
    }
}