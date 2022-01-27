package student_dmitrijs_sinkevics.lesson_6.lvl_3_junior;

import java.util.Arrays;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class ArrayService {
    boolean contains(int[] arr, int numberToSearch) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToSearch)
                return true;
        }
        return false;
    }

    int countOccurrences(int[] arr, int numberToSearch) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToSearch)
                count++;
        }
        return count;
    }

    boolean replaceFirst(int[] arr, int numberToReplace, int newNumber) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i]= newNumber;
                return true;
            }
        }
        return false;
    }

    int replaceAll(int[] arr, int numberToReplace, int newNumber) {
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                count++;
            }
        }
        return count;
    }

    void revert(int[] arr){
        for (int i = 0; i < arr.length / 2; i++) {
            int reverseNumber = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = reverseNumber;
        }
    }

    void sort(int[] arr){
        Arrays.sort(arr);

    }
}