package student_jurij_mardusevic.lesson_4_if_statement.homework.level_1_intern.Task_3;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class DaysOfTheWeek {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Day of week: ");
        int dayOfWeek = scanner.nextInt();

        switch (dayOfWeek) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }

    }
}
