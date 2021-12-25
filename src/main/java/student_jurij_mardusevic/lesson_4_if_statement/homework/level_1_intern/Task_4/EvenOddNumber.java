package student_jurij_mardusevic.lesson_4_if_statement.homework.level_1_intern.Task_4;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class EvenOddNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");

        int number = scanner.nextInt();

        if ( number % 2 == 0){
            System.out.println("This Number is even");
        } else {
            System.out.println("This Number is odd");
        }

    }
}
