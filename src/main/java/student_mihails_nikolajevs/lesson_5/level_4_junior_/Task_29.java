package student_mihails_nikolajevs.lesson_5.level_4_junior_;
/*
апишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите все чётные числа в массиве и выведети их на консоль.
 */

import java.util.Random;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task_29 {

    public static void main(String[] args) {
        Random random = new Random();
        random.nextInt();

        int arrayLength = random.nextInt(50);
        int[] number = new int[arrayLength];

        for (int i = 0; i < number.length; i++) {

            number[i] = random.nextInt(50);

            System.out.println(number[i]);
        }

        for (int a = 0; a < number.length; a++) {
            if (number [a] % 2 == 0) {

                System.out.println(" ALL ARRAY EVEN NUMBERS : " + number [a]);
            }
        }
    }
}



