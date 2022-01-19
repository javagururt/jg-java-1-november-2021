package student_dima_talanov.lesson_6.level_3_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task13 {

    public static void main(String[] args) {
        int[] numberArray = {2, 8, 16, 20, 24, 8, 8, 8};
        int myNumber = 2;
        System.out.println("Number array is: " + countOccurrences(numberArray, myNumber));
    }

    static int countOccurrences(int[] arr, int numberToSearch) {
        int count = 0;
        for (int value : arr) {
            if (value == numberToSearch) ;
            count++;
        }
        return count++;
    }
}

