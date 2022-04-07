package student_valeriia_kulikova.lesson_12_exceptions.homework.level_3_junior;

import java.io.IOException;
import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class WrongUserInputHandlingDemo {
    public static void main(String[] args) throws IOException {
        UI();

    }

    public static void UI() throws IOException {
        Scanner scanner = new Scanner(System.in);
        boolean check = false;
        while (!check) {
            try {
                System.out.println("Enter integer number: ");
                int number = scanner.nextInt();
                System.out.println("Thank you! Your number is: " + number);
                check = true;
            } catch (Exception e) {
                scanner.next();
                System.out.println("Wrong type!");
            }
        }
    }
}
