package teacher.lesson_6_arrays_while_loop.lessoncode;

import java.util.Arrays;

class ArrayToStringExample extends Object {

    public static void main(String[] args) {
        int[] numbers = {3, 5, 1, 10, 5, 2, 3};
        System.out.println("Array length: " + numbers.length);
        System.out.println("Array: " + Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }
        System.out.println(" -------- ");

        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            if (isUniqueValue(number, numbers, i)) {
                System.out.println(number);
            }
        }
    }

    private static boolean isUniqueValue(int number, int[] numbers, int currentIndex) {
        for (int i = 0; i < currentIndex; i++) {
            if (number == numbers[i]) {
                return false;
            }
        }
        return true;
    }
}
