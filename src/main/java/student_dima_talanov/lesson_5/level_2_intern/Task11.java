package student_dima_talanov.lesson_5.level_2_intern;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];
        System.out.println("Enter first my array numbers:");
        numbers[0] = scanner.nextInt();
        System.out.println("Enter second my array numbers:");
        numbers[1] = scanner.nextInt();
        System.out.println("Enter third my array numbers:");
        numbers[2] = scanner.nextInt();
        System.out.println("My array numbers is:" + numbers[0] + " " + numbers[1] + " " + numbers[2]);
    }
}



