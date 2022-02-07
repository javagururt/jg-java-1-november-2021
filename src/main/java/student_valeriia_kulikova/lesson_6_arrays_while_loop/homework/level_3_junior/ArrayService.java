package student_valeriia_kulikova.lesson_6_arrays_while_loop.homework.level_3_junior;

import java.util.Arrays;

public class ArrayService {

    boolean contains(int[] arr, int numberToSearch)
    {
        boolean number = false;
        for (int i = 0; i < arr.length; i++) {
            if (numberToSearch != arr[i]) {
                number = false;
            }
            else {
                number = true;
                break;
            }
        }

        return number;
    }

    int amountOfNumbers (int [] arr, int numberToSearch) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (numberToSearch == arr[i]) {
                count++;
            }

        }
        return count;
    }

    int [] replaceFirst (int [] arr, int numberToReplace, int newNumber) {

        for (int i = 0; i < arr.length; i++) {
            if (numberToReplace == arr[i]) {arr[i]= newNumber;

            break;}
        }
        return arr;
    }

    int[] replaceAll(int[] arr, int numberToReplace, int newNumber) {
        for (int i = 0; i < arr.length; i++) {
            if (numberToReplace == arr[i]) {arr[i]= newNumber;
            }
        }
        return arr;
    }
    int [] reverseArray (int [] arr) {
        int [] newArray5 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArray5 [i] = arr[arr.length - 1 - i];
        }
        return newArray5;
    }

    int [] sortingArray (int [] arr) {
        for (int i = 0; i < arr.length; i++) {
        int min = arr [i];
        int min_i = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
        return arr;
    }
    }




