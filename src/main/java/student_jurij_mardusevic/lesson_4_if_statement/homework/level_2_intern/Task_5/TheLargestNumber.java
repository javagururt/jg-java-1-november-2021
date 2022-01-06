package student_jurij_mardusevic.lesson_4_if_statement.homework.level_2_intern.Task_5;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class TheLargestNumber {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter two numbers:  ");
        int number1 = keyboard.nextInt();
        int number2 = keyboard.nextInt();

        if (number1>number2){
            System.out.println("Maximum number is "+number1);
        } else if (number2>number1) {
            System.out.println("Maximum number is "+number2);
        } else {
            System.out.println("Numbers must be different, try again");
        }

    }
}
