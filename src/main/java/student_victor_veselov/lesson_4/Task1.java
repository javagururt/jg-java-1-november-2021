package student_victor_veselov.lesson_4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number ");
        int a = scanner.nextInt();
        if (a > 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");
        }

    }
}