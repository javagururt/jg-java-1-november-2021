package student_julija_radchenko.lesson_6_homeworks.level_3_junior;

import java.util.Arrays;

public class ArrayService {

    boolean contains(int[] arr, int numberToSearch) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToSearch)
                return true;
        }

        return false;
    }

    int countOccurrences(int[] arr, int numberToSearch) {
        int numberCounter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToSearch) {
                numberCounter++;
            }
        }
        return numberCounter;

    }

    boolean replaceFirst(int[] arr, int numberToReplace, int newNumber) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                return true;
            }
        }
        return false;
    }

    int replaceAll(int[] arr, int numberToReplace, int newNumber) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;

            }
        }

        return numberToReplace;
    }

    void revert(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int reverse = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = reverse;


        }
    }
    void sort(int[] arr){
        Arrays.sort(arr);
    }
}



