package student_jurij_mardusevic.lesson_4_if_statement.homework.level_3_junior.Task_10;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class ThreeNumbers2 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter three numbers: ");

        int number1 = keyboard.nextInt();
        int number2 = keyboard.nextInt();
        int number3 = keyboard.nextInt();

        if (number1 > number2 && number1 > number3) {
            System.out.println("Number " + number1 + " is largest");
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("Number " + number2 + " is largest");
        } else if (number3 > number1 && number3 > number2) {
            System.out.println("Number " + number3 + " is largest");
        } else if (number1 == number2 || number1 == number3 || number2 == number3)
            System.out.println("Integers must be different, try again");

    }
}

