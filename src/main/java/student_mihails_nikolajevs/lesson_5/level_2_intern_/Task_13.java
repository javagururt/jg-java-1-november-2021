package student_mihails_nikolajevs.lesson_5.level_2_intern_;
/*
Написашите программу, в которой:
 - создайте массив целых чисел длиной 3,
 - заполните каждую ячейку массива случайным числом,
 - посчитайте сумму всех ячеек и распечатайте ее на консоль.

*/
import java.util.Random;
public class Task_13 {

    public static void main(String[] args) {
        Random random = new Random();

        int sum = 0;

        int[] number = new int[3];

        for (int i = 0; i < number.length; i++) {

            number[i] = random.nextInt(50);

            sum = sum + number[i];

            System.out.println(" Number " + (i + 1) + " : " + number[i]);
        }
        System.out.println(" SUM OF ALL NUMBERS : " + sum);
    }
}