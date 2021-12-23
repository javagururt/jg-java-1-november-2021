package student_jurij_mardusevic.lesson_4_if_statement.homework.level_1_intern.Task_1;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");

    int number = scanner.nextInt();

    if (number > 0) {
        System.out.println("Number is positive");

    } else System.out.println("Number is negative");
}
}


