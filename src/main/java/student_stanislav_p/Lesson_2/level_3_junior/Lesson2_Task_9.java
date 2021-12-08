package student_stanislav_p.Lesson_2.level_3_junior;

/*
Напишите программу, которая запрашивает у пользователя целое число
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
import java.util.Scanner;

public class Lesson2_Task_9 {

        public static void main(String [] args) {


            Scanner scanner = new Scanner(System.in);


            System.out.println("Введите число ->");

            int Num1 = scanner.nextInt();


            for(int i = 1; i < 11; i++) {
                int Mult=Num1 * i;
                System.out.println(Num1 + " x " + i + " = " + Mult);
            }

        }

}
