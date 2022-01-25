package student_stanislav_p.lesson_6_arrays_while_loop.level_4_junior;

import teacher.annotations.CodeReview;

/*
Создайте класс TwoDimensionalArray и в нём напишите программу в которой:
- создайте двумерный массив;
- заполните двумерный массив случайными числами;
- посчитайте сумму всех чисел в двумерном массиве.

}
 */
@CodeReview(approved = true)
public class TwoDimensionalArrayTest {


    public static void main(String[] args) {

        TwoDimensionalArrayTest test = new TwoDimensionalArrayTest();

        int arrayLength1 = 5;
        int arrayLength2 = 5;

        int bound = 1000;

        int expectedResultLength1 = 5;
        int expectedResultLength2 = 5;

        int[][] testArray = {{10, 20, 87, 3, 99},
                {15, 17, 27, 81, 62},
                {11, 87, 44, 25, 31},
                {9, 78, 36, 12, 95},
                {42, 67, 32, 55, 14}};


        test.shouldCreateArray(arrayLength1, arrayLength2, bound);

        // checkResults(expectedResult == arrayTwoDim.arrayLength1, "Test #1 - shouldCreateArray" );
        //System.out.println("-------------- TEST  1 -----------------");
        //        checkResults(expectedResultMax == testFindMaxResult, "Test #2 - shouldFindMax");
    }

    void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + "  OK");
        } else {
            System.out.println(testName + "  FAIL");

        }
    }

    public void shouldCreateArray(int arrayLength1, int arrayLength2, int bound) {

        TwoDimensionalArray arrayTwoDim = new TwoDimensionalArray();

        int [] [] newArray = arrayTwoDim.createNewArray(arrayLength1, arrayLength2, bound);

        arrayTwoDim.fillArrayWithRandomNumbers(newArray, bound);
        arrayTwoDim.printArrayToConsole(newArray);
        int arraySumm = arrayTwoDim.findArraySumm(newArray);

        System.out.println();

        System.out.printf(" The sum of all the numbers in the array is - "+ "%6d", arraySumm);



    }

/*

    public void shouldFindMaxNumber(int[] testArray, int expectedResultMax){
        TwoDimensionalArray arrayUtil = new TwoDimensionalArray();

        int testFindMaxResult = arrayUtil.findArraySumm(testArray);



        System.out.println("Test maximum number -> " + testFindMaxResult);

    }


 */


}