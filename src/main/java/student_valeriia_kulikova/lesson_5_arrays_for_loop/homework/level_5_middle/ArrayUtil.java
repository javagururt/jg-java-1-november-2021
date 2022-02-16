package student_valeriia_kulikova.lesson_5_arrays_for_loop.homework.level_5_middle;

import java.util.Arrays;

import teacher.annotations.CodeReview;

/*Создайте класс ArrayUtil.
Напишите в этом классе метод для создания
массива целых чисел указанной длины.*/
@CodeReview(approved = true)
public class ArrayUtil {

    public int[] createArray(int arrayLength) {
        int[] numbers = new int[arrayLength];

        return numbers;

    }

    public void fillArrayWithRandomNumbers(int[] array) {

        int a = 1;
        int b = 50;
        for (int i = 0; i < array.length; i++) {
            array[i] = a + (int) (Math.random() * b);
        }
    }

    public void printArrayToConsole(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Numbers:" + Arrays.toString(array));

        }
    }
        public int findMaxNumber(int[] array) {
            int max = 1;
            for (int i = 0; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            return max;
        }
        public int findMinNumber(int[] array) {
            int min = 50;
            for (int i = 0; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }
            return min;
        }
    }
