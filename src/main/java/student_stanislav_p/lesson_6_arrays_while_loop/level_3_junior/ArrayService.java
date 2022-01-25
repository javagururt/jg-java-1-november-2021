package student_stanislav_p.lesson_6_arrays_while_loop.level_3_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class ArrayService {

    /* public  boolean contains(int[] arr, int numberToSearch) {

        int count = 0;
        boolean result = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr [i] == numberToSearch) { count = count +1;}
        }

        if (count > 0) { result = true; }

        return result;
    }

     */

    public  int contains(int[] arr, int numberToSearch) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr [i] == numberToSearch) { count = count +1;}
        }


        return count;
    }


    boolean replaceFirst(int[] arr, int numberToReplace, int newNumber){

        int count =0;

        for (int i = 0; i < arr.length; i++) {
            if ((arr [i] == numberToReplace) && (count==0)) {
                arr[i] = newNumber ;
                count= count +1;
            }
        }

        return (count >0);
    }

    int replaceAll(int[] arr, int numberToReplace, int newNumber){

        int count =0;

        for (int i = 0; i < arr.length; i++) {
            if (arr [i] == numberToReplace) {
                arr[i] = newNumber ;
                count= count +1;
            }
        }

        return count;
    }

    int [] revertArr(int[] arr){

        int [] localRevertArr =  new int[arr.length];;

        for (int i = 0; i < arr.length; i++) {
            localRevertArr[i] = arr [(arr.length-i-1)];
        }

        return localRevertArr;
    }

    void sortArray(int[] arr){


        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++) {


                // Сравниваем элементы попарно, если они имеют неправильный порядок, то меняем местами

                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
}
