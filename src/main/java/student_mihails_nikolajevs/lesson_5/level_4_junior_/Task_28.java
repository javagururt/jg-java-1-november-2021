package student_mihails_nikolajevs.lesson_5.level_4_junior_;
/*
Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите наименьшее число в массиве и выведети его на консоль.
 */
import java.util.Random;

public class Task_28 {

    public static void main(String[] args) {
        Random random = new Random();
        random.nextInt(25);

        int a = random.nextInt(25);
        int[] number = new int[a];

        for (int i = 0; i < number.length; i++) {

            number[i] = random.nextInt(25);

            System.out.println(number[i]);
        }
            int min =  number[0];

        for (int b = 0; b < number.length; b++) {
            if (number [b] < min) {
            min = number[b];
            }
        }

        System.out.println(" ARRAY MIN NUMBER : " + min);
    }
}


