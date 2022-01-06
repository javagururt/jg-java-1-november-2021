package student_jurij_mardusevic.lesson_4_if_statement.homework.level_2_intern.Task_7;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class TwoIntegers {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter two numbers: " );

        int number1 = keyboard.nextInt();
        int number2 = keyboard.nextInt();

        if (number1 == number2) {
            System.out.println("Numbers are equals");
        } else {
            System.out.println("Numbers are different");
        }
    }
}
