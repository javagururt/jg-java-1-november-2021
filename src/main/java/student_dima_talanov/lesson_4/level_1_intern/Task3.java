package student_dima_talanov.lesson_4.level_1_intern;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task3 {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int day = num.nextInt();

        if (day == 1) {
        System.out.println("Monday");
        } else if (day ==2) {
        System.out.println("Tuesday");
        } else if (day ==3) {
            System.out.println("Wednesday");
        } else if (day ==4) {
            System.out.println("Thursday");
        } else if (day ==5) {
            System.out.println("Friday");
        } else if (day ==6) {
            System.out.println("Saturday");
        } else if (day ==7) {
            System.out.println("Sunday");
        } else {
            System.out.println("There’s no such day of the week");
        }
    }
}
