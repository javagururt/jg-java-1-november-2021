package student_dmitrijs_sinkevics.lesson_4.lvl_1_intern;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int inputValue = keyboard.nextInt();
        System.out.print("Enter integer");

        if (inputValue > 0) {
            System.out.print("Inter is positive");
        } else if (inputValue < 0) {
            System.out.println("Integer is negative");
        } else {
            System.out.println("Integer == 0");
        }
    }
}
