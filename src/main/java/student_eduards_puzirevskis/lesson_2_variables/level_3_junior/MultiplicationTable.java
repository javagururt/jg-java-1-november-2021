package student_eduards_puzirevskis.lesson_2_variables.level_3_junior;

import java.util.Scanner;

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
/*
*/
public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Please, enter integer number : ");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {

            int total = number * i;
            System.out.println(number + "*" + i + "=" + total);
        }
    }
}
