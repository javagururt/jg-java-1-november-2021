package student_stanislav_p.lesson_6_arrays_while_loop.homework.level_3_junior;


import java.util.Arrays;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class ArrayServiceTest {

    public static void main(String[] args) {

        int[] listOfNumbers = {1, 2, 15, 4, 5, 7, 7, 8, 9, 8, 7, 7, 5, 4, 3, 2, 1, 5, 5, 7, 7, 9, 9, 9, 9, 9};
        int[] listOfTestNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};


        boolean[] listOfExpectedResults = {true, true, true, true, true, false, true, true, true};


        int [] listOfExpectedNumbersAfterReplace = { 11,11,15,11,11,11,7,11,11,8,7,7,5,4,3,2,1,5,5,7,7,9,9,9,9,9};
        int [] listOfExpectedNumbersAfterReplaceAll = { 1,2,15,4,5,7,7,8,55,8,7,7,5,4,3,2,1,5,5,7,7,55,55,55,55,55};

        int [] expectedOfCount =      {2,2,1,2,4,0,6,2,6};

        int [] arrayForReplaceFirst = Arrays.copyOf(listOfNumbers, listOfNumbers.length);
        int [] arrayForReplaceAll = listOfNumbers.clone();

        int [] arrayForRevert = listOfNumbers.clone();
        int [] arrayExpectedAfterRevert = { 9,9,9,9,9,7,7,5,5,1,2,3,4,5,7,7,8,9,8,7,7,5,4,15,2,1};

        int [] arrayForSort = listOfNumbers.clone();
        int [] arrayForSort2 = listOfNumbers.clone();
        int [] arrayExpectedAfterSort = { 1,1,2,2,3,4,4,5,5,5,5,7,7,7,7,7,7,8,8,9,9,9,9,9,9,15};


        ArrayServiceTest test = new ArrayServiceTest();

        ArrayService testMethod = new ArrayService();

        System.out.println(" --------- Test 1  & Test 2 -------------");

        for (int i = 0; i < listOfTestNumbers.length; i++) {

            int count = testMethod.contains(listOfNumbers,listOfTestNumbers[i]);
            boolean condition1 = (count>0);

            // TEST 1

            System.out.println( " ");
            test.checkTestResult(condition1==listOfExpectedResults[i], ("Test #1 for " + listOfTestNumbers[i]));

            // TEST 2

            boolean condition2 = (count == expectedOfCount[i]);
            test.checkTestResult(condition2, ("Test #2 for " + listOfTestNumbers[i]));
        };

        // TEST 3

        System.out.println( " ");
        System.out.println(" ------------- Test 3 -------------");
        System.out.println( " ");

        for (int i = 0; i < listOfTestNumbers.length; i++) {

            testMethod.replaceFirst(arrayForReplaceFirst, listOfTestNumbers[i], 11 );

        }

        for (int i = 0; i < listOfTestNumbers.length; i++) {


            boolean condition3 = (arrayForReplaceFirst[i] == listOfExpectedNumbersAfterReplace[i]);

            test.checkTestResult(condition3, ("Test #3 for " + listOfTestNumbers[i]));
        }

        // TEST 4

        System.out.println( " ");

        System.out.println(" ------------- Test 4 -------------");
        System.out.println( " ");


        testMethod.replaceAll(arrayForReplaceAll, 9, 55 );


        System.out.println("Array: " + Arrays.toString(arrayForReplaceAll));
        System.out.println("Array: " + Arrays.toString(listOfExpectedNumbersAfterReplaceAll));

        for (int i = 0; i < arrayForReplaceAll.length; i++) {


            boolean condition4 = (arrayForReplaceAll[i] == listOfExpectedNumbersAfterReplaceAll[i]);

            test.checkTestResult(condition4, ("Test #4 for " + arrayForReplaceAll[i]));
        }

        System.out.println(" ------------- Test 5 -------------");
        System.out.println( " ");


        arrayForRevert = testMethod.revertArr(listOfNumbers);

        //System.out.println("Array: " + Arrays.toString(arrayForRevert));
        //System.out.println("Array: " + Arrays.toString(arrayExpectedafterRevert));

        for (int i = 0; i < arrayForRevert.length; i++) {


            boolean condition5 = (arrayForRevert[i] == arrayExpectedAfterRevert[i]);

            test.checkTestResult(condition5, ("Test #5 for " + arrayForRevert[i]));
        }

        System.out.println(" ------------- Test 6 -------------");
        System.out.println( " ");

        //System.out.println("Array: " + Arrays.toString(arrayForSort));

        testMethod.sortArray(arrayForSort);

        //System.out.println("Array: " + Arrays.toString(arrayForSort));
        //System.out.println("Array: " + Arrays.toString(arrayExpectedAfterSort));

        for (int i = 0; i < arrayForSort.length; i++) {


            boolean condition6 = (arrayForSort[i] == arrayExpectedAfterSort[i]);

            test.checkTestResult(condition6, ("Test #6 for " + arrayForSort[i]));
        }

        System.out.println(" ------------- Test 7 -------------");
        System.out.println( " ");

        System.out.println("Array: " + Arrays.toString(arrayForSort2));

        //Сортируем массив
        Arrays.sort(arrayForSort2);

        System.out.println("Array: " + Arrays.toString(arrayForSort2));
        System.out.println("Array: " + Arrays.toString(arrayExpectedAfterSort));

        for (int i = 0; i < arrayForSort2.length; i++) {


            boolean condition6 = (arrayForSort2[i] == arrayExpectedAfterSort[i]);

            test.checkTestResult(condition6, ("Test #7 for " + arrayForSort2[i]));
        }

    }

    //-------------------------------------------

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }

}
