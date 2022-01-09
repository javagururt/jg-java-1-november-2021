package student_eduards_puzirevskis.lesson_5_arrays_for_loop.level_5_middle;

import java.util.Arrays;

public class ArrayUtilsDemo {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] numbers = arrayUtil.createArray(15);
        arrayUtil.fillArrayWithRandomNumbers(numbers);
        arrayUtil.printArrayToConsole(numbers);
        int arrayMaxNumber = arrayUtil.findMaxNumber(numbers);
        System.out.println("Your array MAX number is: " + arrayMaxNumber);
        int arrayMinNumber = arrayUtil.findMinNumber(numbers);
        System.out.println("Your array MAX number is: " + arrayMinNumber);
    }
}
