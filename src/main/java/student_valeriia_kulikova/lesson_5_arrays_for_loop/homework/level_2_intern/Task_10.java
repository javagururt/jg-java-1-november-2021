package student_valeriia_kulikova.lesson_5_arrays_for_loop.homework.level_2_intern;

import java.util.Arrays;

public class Task_10 {
    /*Напишите программу, в которой:
 - создайте массив целых чисел длиной 3,
 - заполните каждую ячейку массива любым целым числом,
 - выведите значение каждой ячейки на консоль.
*/
    static class ArrayOfNumbers {
        public static void main(String[] args) {
            int [] arrayOfNumbers = new int [3];
            arrayOfNumbers[0] = 15;
            arrayOfNumbers[1] = 22;
            arrayOfNumbers[2] = 40;
            System.out.println("Numbers: " + Arrays.toString(arrayOfNumbers) + ".");
        }
    }
}
