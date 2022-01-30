package student_andrei_karamnov.lesson_7_encapsulation.homework.level_6_middle;

import java.util.Arrays;

class ArrayCopyTest {
    public static void main(String[] args) {
        ArrayCopyTest test = new ArrayCopyTest();
        test.arrayCopyRangeTest1();
        System.out.println();
        test.arrayCopyRangeTest2();

    }
    void arrayCopyRangeTest1(){
        boolean realResult;
        boolean expectedResult = true;
        int[] testArray1 = {3, 7, 2, 11, 5, 13, 17};
        int numberFrom = 6;
        int numberTo = 13;
        int[] expectedResultArray1 = {7, 11, 13};

        ArrayCopy copy = new ArrayCopy(testArray1, numberFrom, numberTo);
        int[]realArray = copy.copyInRange(testArray1, numberFrom, numberTo);
        realResult = checkResultArray(realArray, expectedResultArray1);

        System.out.println("Test array 1: " + Arrays.toString(testArray1));
        System.out.println("Real copy range array: " + Arrays.toString(realArray));
        System.out.println("Expected copy range array: " + Arrays.toString(expectedResultArray1));
        checkTestResult(realResult, expectedResult, "Array copy range TEST 1");
    }
    void arrayCopyRangeTest2(){
        boolean realResult;
        boolean expectedResult = true;
        int[] testArray2 = {21, 7, 13, 11, 5, 18, 33, 43, 14, 6, 23, 16, 2, 30};
        int numberFrom = 8;
        int numberTo = 29;
        int[] expectedResultArray2 = {21, 13, 11, 18, 14, 23, 16};

        ArrayCopy copy = new ArrayCopy(testArray2, numberFrom, numberTo);
        int[]realArray = copy.copyInRange(testArray2, numberFrom, numberTo);
        realResult = checkResultArray(realArray, expectedResultArray2);

        System.out.println("Test array 2: " + Arrays.toString(testArray2));
        System.out.println("Real copy range array: " + Arrays.toString(realArray));
        System.out.println("Expected copy range array: " + Arrays.toString(expectedResultArray2));
        checkTestResult(realResult, expectedResult, "Array copy range TEST 2");

    }

    private void checkTestResult(boolean realResult, boolean expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
    static boolean checkResultArray(int[] realArray, int[] expectedArray) {
        boolean result = true;
        if (realArray.length != expectedArray.length) {
            return false;
        } else {
            for (int i = 0; i < expectedArray.length; i++) {
                for (int j = 0; j < realArray.length; j++) {
                    result = (expectedArray[i] == realArray[j]);
                }
            }
            return result;
        }
    }
}
