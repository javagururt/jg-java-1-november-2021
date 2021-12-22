package student_valeriia_kulikova.lesson_4_if_statement.homework.level_1_intern;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, write number from 1 to 7: ");
        int x = scanner.nextInt();

        if (x < 0) {
            System.out.println("Wrong number");
        } else if (x == 0) {
            System.out.println("Wrong number");
        } else if (x == 1) {
            System.out.println("Monday");
        } else if (x == 2) {
            System.out.println("Tuesday");
        } else if (x == 3) {
            System.out.println("Wednesday");
        } else if (x == 4 ) {
            System.out.println("Thursday");
        } else if (x == 5) {
            System.out.println("Friday");
        } else if (x == 6) {
            System.out.println("Saturday");
        } else if (x == 7) {
            System.out.println("Sunday");
        } else if (x > 7) {
            System.out.println("Wrong number");
        }
    }
}
