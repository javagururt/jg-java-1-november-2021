package student_victor_veselov.lesson_4;

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number :");
        int a = scanner.nextInt();
        System.out.println("Enter 2st number :");
        int b = scanner.nextInt();
        System.out.println("Enter 3st number :");
        int c = scanner.nextInt();

        if (a == b && b == c) {
            System.out.println("Numbers equals");
        } else if (a == b) {
            System.out.println("Number 1 and 2 equals");
        } else if (b == c) {
            System.out.println("Number 2 and 3 equals");
        } else if (a == c) {
            System.out.println("Number 1 nad 3 equals");
        } else {
            System.out.println("Numbers is different");
        }

    }

}
