package student_dima_talanov.lesson_6.level_3_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task12 {

    public static void main(String[] args) {
        int[] numberArray = {2, 8, 16, 20, 24, 8, 8, 8};
        int myNumber = 2;
        System.out.println("Result is: " + contains(numberArray, myNumber));

    }

    static boolean contains(int[] arr, int numberToSearch) {
        for (int value : arr) {
            if (value == numberToSearch)
                return true;
        }
        return false;
    }
}



