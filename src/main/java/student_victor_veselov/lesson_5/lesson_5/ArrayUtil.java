package student_victor_veselov.lesson_5.lesson_5;

import java.util.Arrays;
import java.util.Random;

public class ArrayUtil {

    public static int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public static void fillArrayWithRandomNumbers(int[] array) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            int randomNumbers = rand.nextInt(10);
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
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }


}