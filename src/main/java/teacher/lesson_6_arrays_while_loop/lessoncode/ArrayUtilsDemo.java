package teacher.lesson_6_arrays_while_loop.lessoncode;

import java.util.Arrays;

class ArrayUtilsDemo {

    public static void main(String[] args) {
        ArrayUtils arrayUtils = new ArrayUtils();
        int[] numbers = arrayUtils.createArray(30);
        System.out.println(Arrays.toString(numbers));

        arrayUtils.fillArrayWithRandomNumbers(numbers, -5, 5);
        System.out.println(Arrays.toString(numbers));

//        arrayUtils.printArray(numbers);
//        arrayUtils.printlnArray(numbers);
    }

}
