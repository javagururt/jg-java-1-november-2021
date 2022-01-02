package student_rolands_gudels.lesson_5_arrays_for_loop.level_2_intern;

import java.util.Random;

 class Task_12 {
    public static void main(String[] args) {


/*    Напишите программу, в которой:
            - создайте массив целых чисел длиной 3,
            - заполните каждую ячейку массива случайным числом,
 - выведите значение каждой ячейки на консоль.*/
        Random random = new Random();
        random.nextInt();
        int[] number = new int[3];
        for (int i = 0; i < number.length; i++) {
            number[i]= random.nextInt(10);
            System.out.println(number[i]);

        }

    }

}
