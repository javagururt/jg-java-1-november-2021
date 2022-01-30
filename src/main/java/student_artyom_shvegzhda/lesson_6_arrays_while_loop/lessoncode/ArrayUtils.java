package student_artyom_shvegzhda.lesson_6_arrays_while_loop.lessoncode;

import java.util.Random;

class ArrayUtils {

    public int[] createArray(int size) {
        return new int[size];
    }

    public void fillArrayWithRandomNumbers(int[] numbers, int from, int to) {
        Random random = new Random();
        for (int i = 1; i < numbers.length; i++) {
            int bound = to - from;
            int randomNumber = random.nextInt(bound) + from;
            numbers[i] = randomNumber;
        }
    }

    public int sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
//            sum += array[i];
            sum = sum + array[i];
        }

        return sum;
    }

    public int findMin(int[] array) {
        int min = Integer.MAX_VALUE;

        for (int number : array) {
            if (number < min) {
                min = number;
            }
        }

        return min;
    }

    public void printlnArray(int[] array) {
        for (int number : array) {
            System.out.println(number);
        }
    }

    public void printArray(int[] array) {
        for (int number : array) {
            System.out.print(number + ", ");
        }
        System.out.println();
    }
}
