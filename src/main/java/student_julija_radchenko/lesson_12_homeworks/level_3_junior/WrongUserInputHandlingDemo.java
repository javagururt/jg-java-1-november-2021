package student_julija_radchenko.lesson_12_homeworks.level_3_junior;

import java.util.InputMismatchException;
import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class WrongUserInputHandlingDemo {
    public static void main(String[] args) {
        System.out.println("Enter whole number: ");

        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Please enter WHOLE number!");
            }
        }
    }
}
