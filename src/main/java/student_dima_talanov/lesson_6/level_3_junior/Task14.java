package student_dima_talanov.lesson_6.level_3_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task14 {

    public static void main(String[] args) {
        int[] numberArray = {2, 8, 16, 20, 24, 8, 8, 8};
        int myNumber = 5;
        int numberToReplace = 8;
        System.out.println("Result is: " + replaceFirst(numberArray, numberToReplace, myNumber));
    }

    public static boolean replaceFirst(int[] arr, int numberToReplace, int newNumber) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                return true;
            }
        }
        return false;
    }
}
