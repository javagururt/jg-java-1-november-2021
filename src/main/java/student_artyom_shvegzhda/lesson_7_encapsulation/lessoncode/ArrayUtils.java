package student_artyom_shvegzhda.lesson_7_encapsulation.lessoncode;

import java.util.Random;

public class ArrayUtils {

    private ArrayUtils() {
    }

    public static int[] createRandomArray() {
        int[] array = getRandomSizeArray();
        fillArrayWithRandomNumbers(array);
        printArray(array);
        return array;
    }

    private static int[] getRandomSizeArray() {
        Random random = new Random();
        int randomNumber = random.nextInt(200) + 1;
        return new int[randomNumber];
    }

    private static void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
