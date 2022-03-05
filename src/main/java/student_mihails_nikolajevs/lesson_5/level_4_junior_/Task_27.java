package student_mihails_nikolajevs.lesson_5.level_4_junior_;
/*
Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите наибольшее число в массиве и выведети его на консоль.

 */
import java.util.Random;

public class Task_27 {

    public static void main(String[] args) {

        Random random = new Random();

        int a = random.nextInt(50);
        int[] number = new int[a];
        int max = number[0];

        for (int i = 0; i < number.length; i++) {

            number[i] = random.nextInt(50);

            System.out.println(number[i]);

            for (int b : number) {

                if (b > max) max = b;
            }
        }
        System.out.println(" ARRAY MAX NUMBER : " + max);

    }

}
