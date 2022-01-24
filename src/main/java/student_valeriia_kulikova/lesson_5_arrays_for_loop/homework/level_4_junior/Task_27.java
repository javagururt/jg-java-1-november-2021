package student_valeriia_kulikova.lesson_5_arrays_for_loop.homework.level_4_junior;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите наибольшее число в массиве и выведети его на консоль.*/
public class Task_27 {
    public static void main(String[] args) {

        Random random = new Random();
        int a = 1;
        int b = 50;
        int max = 0;

        int arrayLenght = a + (int) (Math.random() * b);
        int[] numbers = new int[arrayLenght];

        System.out.println("Array of lenght: " + arrayLenght);

        for (int i = 0; i < numbers.length; i++) {
            numbers [i] = a + (int) (Math.random() * b);
            if (numbers[i] > max) {
                max = numbers [i];
            }
        }
        System.out.println("Numbers: " + Arrays.toString(numbers));
        System.out.println("Max of numbers: " + max);


    }

}
