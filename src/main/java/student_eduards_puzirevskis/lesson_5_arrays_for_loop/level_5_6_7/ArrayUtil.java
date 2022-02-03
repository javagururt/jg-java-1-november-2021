package student_eduards_puzirevskis.lesson_5_arrays_for_loop.level_5_6_7;

import java.util.Arrays;

import teacher.annotations.CodeReview;

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
@CodeReview(approved = true)
class ArrayUtil {


     public int[] createArray(int size) {
        return new int[size];
     }



    public void fillArrayWithRandomNumbers(int[] numbers) {
         for (int i = 0; i < numbers.length; i++) {
             numbers[i] = (int)(Math.random()*101)-50;
         }
     }

    public void printArrayToConsole(int[] numbers) {
        System.out.println("Your array is: " + Arrays.toString(numbers));
    }

    public int findMaxNumber(int[] numbers) {
        int max = numbers[0] - 1;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
    public int findMinNumber(int[] numbers) {
        int min = numbers[0] + 1;
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

}
