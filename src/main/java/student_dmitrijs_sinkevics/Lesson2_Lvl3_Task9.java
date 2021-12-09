package student_dmitrijs_sinkevics;
import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Lesson2_Lvl3_Task9 {
    public static void main(String[] args) {
  /*  Напишите программу, которая запрашивает у пользователя целое число
    и печатает на консоль таблицу умножения для этого числа до 10.

    Test Data:
    Input a number: 8

    Expected Output :
            8 x 1 = 8
            8 x 2 = 16
            8 x 3 = 24
            ...
            8 x 10 = 80
   */
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Введите целое число");
        int a = keyboard.nextInt();

        for (int i=1;i<11;i++){
            int b=i*a;
            System.out.println(a+" x "+i+" = "+b);
        }


    }
}
