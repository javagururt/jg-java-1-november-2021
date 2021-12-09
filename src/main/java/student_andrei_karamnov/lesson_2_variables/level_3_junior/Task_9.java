package student_andrei_karamnov.lesson_2_variables.level_3_junior;

        /*Напишите программу, которая запрашивает у пользователя целое число
и печатает на консоль таблицу умножения для этого числа до 10.*/

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task_9 {
            public static void main(String[] args) {
                System.out.println("Please enter an integer");
                Scanner input = new Scanner(System.in);
                        int x = input.nextInt();

                    for (int y = 1; y < 10; y++) {
                        System.out.println(x + " x " + y + " = " + x * y);
                    }
                    System.out.println();
                }

            }


