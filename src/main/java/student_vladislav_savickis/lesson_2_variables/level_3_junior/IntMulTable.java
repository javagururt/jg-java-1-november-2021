package student_vladislav_savickis.lesson_2_variables.level_3_junior;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class IntMulTable {
    public static void main(String[] args) {
        int number;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number that will be multiplied: ");
        number = scanner.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}
