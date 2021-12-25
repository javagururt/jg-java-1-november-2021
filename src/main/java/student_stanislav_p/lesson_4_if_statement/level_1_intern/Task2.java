package student_stanislav_p.lesson_4_if_statement.level_1_intern;
/*
Написать программу, которая запрашивает у пользователя
целое число и выводит на консоль
положительное оно, отрицательное или равно нулю.
 */


import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number :");

        int number = scanner.nextInt();

        if (number > 0){
            System.out.println("Number is >0");
        }
        else if (number == 0){
            System.out.println("Number is 0");
        }
        else {
            System.out.println("Number is <0");
        }


    }
}
