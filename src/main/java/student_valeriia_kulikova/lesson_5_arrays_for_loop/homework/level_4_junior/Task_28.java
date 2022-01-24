package student_valeriia_kulikova.lesson_5_arrays_for_loop.homework.level_4_junior;

import java.util.Arrays;
import java.util.Random;
/*Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите наименьшее число в массиве и выведети его на консоль.*/
public class Task_28 {
    public static void main(String[] args) {

        Random random = new Random();
        int a = 1;
        int b = 50;
        int min = 50;

        int arrayLenght = a + (int) (Math.random() * b);
        int[] numbers = new int[arrayLenght];

        System.out.println("Array of lenght: " + arrayLenght);

        for (int i = 0; i < numbers.length; i++) {
            numbers [i] = a + (int) (Math.random() * b);
            if (numbers[i] < min) {
                min = numbers [i];
            }
        }
        System.out.println("Numbers: " + Arrays.toString(numbers));
        System.out.println("Min of numbers: " + min);


    }

}
