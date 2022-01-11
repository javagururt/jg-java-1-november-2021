package student_andrei_karamnov.lesson_6_arrays_while_loop.level_3_junior;

import java.util.Arrays;

class ArrayService {
    boolean contains(int[] arr, int numberToSearch) {
        for (int i = 0; i < arr.length; i++) {
            return arr[i] == numberToSearch;
        }
        return false;
    }

    int countOccurrences(int[] arr, int numberToSearch) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToSearch) {
                count++;
            } else {
                count = count;
            }
        }
        return count;
    }

    boolean replaceFirst(int[] arr, int numberToReplace, int newNumber) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr [i] == numberToReplace) && (count==0)) {
                arr[i] = newNumber;
                count++;
            }
            //System.out.println(arr[i]);
        }
        return (count >0);
    }
    int replaceAll(int[] arr, int numberToReplace, int newNumber){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr [i] == numberToReplace) {
                arr[i] = newNumber;
                count++;
            }
        }
        return count;
    }
    void revert(int[] arr){
        for (int i = 0; i < arr.length / 2; i++);
        {
        int start = 0;
        int end = arr.length - 1;
            while (start < end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
    }
        }
    void sort(int[] arr){
        int indexMin;
        for (int i = 0; i < arr.length - 1; i++) {
            indexMin = i;
            for (int indexToScan = i; indexToScan < arr.length; indexToScan++) {
                if(arr[indexMin] > arr[indexToScan]){indexMin = indexToScan;}
            }
            int tmp = arr[i];
            arr[i] = arr[indexMin];
            arr[indexMin] = tmp;
        }
    }
    }