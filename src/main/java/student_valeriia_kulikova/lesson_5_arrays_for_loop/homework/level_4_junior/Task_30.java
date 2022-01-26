package student_valeriia_kulikova.lesson_5_arrays_for_loop.homework.level_4_junior;

import java.util.Arrays;
import java.util.Random;

/*Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- - найдите все нечётные числа в массиве и выведети их на консоль.*/
public class Task_30 {
    public static void main(String[] args) {

        Random random = new Random();
        int a = 1;
        int b = 30;

        int arrayLenght = a + (int) (Math.random() * b);
        int[] numbers = new int[arrayLenght];

        System.out.println("Array of lenght: " + arrayLenght);

        for (int i = 0; i < numbers.length; i++) {
            numbers [i] = a + (int) (Math.random() * b);
        }

        System.out.println("Numbers: " + Arrays.toString(numbers));
        System.out.println("Odd numbers: ");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers [i] %2 != 0) {
        System.out.print(numbers[i] + ",");
            }
            }
        }
    }

