package student_mihails_nikolajevs.lesson_5.level_5_middle_;
/*
Создайте класс ArrayUtil.
Напишите в этом классе метод для создания
массива целых чисел указанной длины.

class ArrayUtil {

    public int[] createArray(int arrayLength) {
        // Напишите реализацию !!!
    }

}
 */

import java.util.Random;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class ArrayUtil {

    public static int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public static void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            int randomNumbers = random.nextInt(50);
            array[i] = randomNumbers;
        }
    }

    public void printArrayToConsole(int[] array) {
        for (int i : array)

            System.out.println(i);
    }

    public int findMaxNumber(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public int findMinNumber(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
