package student_mihails_nikolajevs.lesson_4.level_1_intern_;

import java.util.Scanner;

/*
Написать программу, которая запрашивает у
пользователя
целое число и выводит на консоль
положительное оно или отрицательное.

 */
public class Task1_ {

    public static void main(String[] args) {

        System.out.println("Please Enter Integer Number: ");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if(number > 0) System.out.println("Your Integer number > 0");

        else {
            System.out.println("Your Integer number < 0");
        }

    }



}
