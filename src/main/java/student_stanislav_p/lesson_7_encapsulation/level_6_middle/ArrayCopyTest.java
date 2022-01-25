package student_stanislav_p.lesson_7_encapsulation.level_6_middle;


public class ArrayCopyTest {

    public static void main(String[] args) {


        ArrayCopyTest newTest = new ArrayCopyTest();

        boolean realResult = true;
        boolean expectedResult = true;


        //-------- TEST 1 -------

        int[] testArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        int numberFrom = 5;
        int numberTo = 10;
        int[] expectedResultArray1 = {5, 6, 7, 8, 9, 10};

        ArrayCopy newTestArray1 = new ArrayCopy(testArray, numberFrom, numberTo);

        int[] realResultArray = newTestArray1.copyInRange(testArray, numberFrom, numberTo);


        realResult = checkArray(realResultArray, expectedResultArray1);

        //System.out.println(Arrays.toString(realResultArray));
        //System.out.println(Arrays.toString(expectedResultArray1));



        newTest.checkTestResult("Test 1 (created array and chek it) - ", realResult, expectedResult);


        //-------- TEST 2 -------

        numberFrom = 20;
        numberTo = 25;

        int[] testArray2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int[] expectedResultArray2 = {0};

        ArrayCopy newTestArray2 = new ArrayCopy(testArray2, numberFrom, numberTo);

        int[] realResultArray2 = newTestArray2.copyInRange(testArray2, numberFrom, numberTo);


        realResult = checkArray(realResultArray2, expectedResultArray2);


        newTest.checkTestResult("Test 2 (created null array and chek it) - ", realResult, expectedResult);

        //System.out.println(Arrays.toString(realResultArray2));
        //System.out.println(Arrays.toString(expectedResultArray2));

        //-------- TEST 3-------

        numberFrom = 10;
        numberTo = 10;

        int[] testArray3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int[] expectedResultArray3 = {10};

        ArrayCopy newTestArray3 = new ArrayCopy(testArray3, numberFrom, numberTo);

        int[] realResultArray3 = newTestArray3.copyInRange(testArray3, numberFrom, numberTo);


        realResult = checkArray(realResultArray3, expectedResultArray3);


        newTest.checkTestResult("Test 3 (created 1-number array and chek it) - ", realResult, expectedResult);


        //-------- TEST 4-------

        numberFrom = 20;
        numberTo = 10;

        int[] testArray4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int[] expectedResultArray4 = {0};

        ArrayCopy newTestArray4 = new ArrayCopy(testArray4, numberFrom, numberTo);

        int[] realResultArray4 = newTestArray4.copyInRange(testArray4, numberFrom, numberTo);


        realResult = checkArray(realResultArray4, expectedResultArray4);


        newTest.checkTestResult("Test 4 (created array wrong numbers and chek it) - ", realResult, expectedResult);




    }

       //_-----------------------------------------


    void checkTestResult(String nameTest, boolean realResult,  boolean expectedResult){

        if (realResult == expectedResult) {
            System.out.println(nameTest + " Control is OK");
        } else {
            System.out.println(nameTest + " Control is FAIL");
        }
    }

    static boolean checkArray(int [] realResultArray, int [] expectedResultArray){

        boolean realResult=true;

        if (realResultArray.length!=expectedResultArray.length) return false;

        for (int i = 0; i < expectedResultArray.length; i++) {
            realResult=realResult && (realResultArray[i]==expectedResultArray[i]);
        }

        return true;
    }


}
