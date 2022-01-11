package student_rolands_gudels.lesson_5_arrays_for_loop.level_5_middle;

import java.util.Random;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Task_31 {
    static class ArrayUtil {
        int arrayLength;
        int[] array = new int[arrayLength];
        Random random = new Random();

         int[] createArray(int arrayLength) {
            this.arrayLength = arrayLength;
            int[] array = new int[arrayLength];
            this.array = array;
            return array;
        }

         void fillArrayWithRandomNumbers() {
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(10);  // Так будет правильно?
            }
        }

         void printArrayToConsole(int[] array){
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }

         int findMaxNumber(int[] array){
            int max = array[0];
            for (int j : array) {
                if (j > max) max = j;
            }
            return max;
        }

         int findMinNumber(int[] array) {
            int min = array[0];
            for (int j : array) {
                if (j < min) min = j;
            }
            return min;

        }
         int[] shouldCreateArray() {
            int[] array = new int[5];
            array[0]=1;
            array[1]=2;
            array[2]=3;
            array[3]=0;
            array[4]=-1;
            return array;
        }
    }
}


