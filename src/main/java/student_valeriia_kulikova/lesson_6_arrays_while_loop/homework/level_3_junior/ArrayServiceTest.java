package student_valeriia_kulikova.lesson_6_arrays_while_loop.homework.level_3_junior;

import java.util.Arrays;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class ArrayServiceTest {
    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 9, 5};
        int searchNumber = 5;
        int numberToReplace = 5;
        int[] arr2 = {1, 3, 25, 7, 9, 5};


        ArrayService aService1 = new ArrayService();

        boolean result = aService1.contains(arr, searchNumber);
        if (result == false) {
            System.out.println("Test 1 is FAIL");
        } else {
            System.out.println("Test 1 is OK");
        }

        int test2 = aService1.amountOfNumbers(arr,searchNumber);
        if (test2 == 2) {
            System.out.println("Test 2 is OK");
        } else {
            System.out.println("Test 2 is FAIL.");
        }

        int[] test3 = aService1.replaceFirst(arr, numberToReplace, 25);

        if (Arrays.equals(test3,arr2)) {System.out.println("Test 3 is OK");} else {
            System.out.println("Test 3 is FAIL.");
        }


        int [] testArray4 = {1,2,3,5,5,5};
        int [] result4 = {1,2,3,50,50,50};
        int[] test4 = aService1.replaceAll(testArray4, numberToReplace, 50);
        if (Arrays.equals(result4,test4)) {
            System.out.println("Test 4 is OK");
        } else {
            System.out.println("Test 4 is FAIL");
        }

        int [] testArray5 = {1,2,3,4,5,6,7,8,9};
        int [] testResult5 = {9,8,7,6,5,4,3,2,1};

        int [] test5 = aService1.reverseArray(testArray5);
        if (Arrays.equals(testResult5,test5)) {
            System.out.println("Test 5 is OK");
        } else {
            System.out.println("Test 5 is FAIL");
        }

        int [] testArray6 = {6,5,4,3,2,1};
        int [] testResult6 = {1,2,3,4,5,6};
        int [] test6 = aService1.sortingArray(testArray6);
        if (Arrays.equals(testResult6,test6)) {
            System.out.println("Test 6 is OK");
        } else {
            System.out.println("Test 6 is FAIL");
        }
    }

}
