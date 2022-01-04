package student_andrei_karamnov.lesson_5_arrays_for_loop.level_5_middle;

import java.util.Arrays;

/*Создайте класс ArrayUtilTest.
В этом классе напишите автоматический тест
для метода int[] createArray(int arrayLength)
из предыдущего задания.*/
class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }
    void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        arrayUtil.createArray(5);
        int result = 5;
        checkResults(result == arrayUtil.arrayLength, "shouldCreateArray Test" );
    }
    public void shouldFindMaxNumber(){
        ArrayUtil arrayUtil = new ArrayUtil();
        arrayUtil.createArray(5);
        int result = 9;
        checkResults(result == arrayUtil.findMaxNumber(arrayUtil.demoArray()), "shouldFindMax Test");
    }
    public void shouldFindMinNumber(){
        ArrayUtil arrayUtil = new ArrayUtil();
        arrayUtil.createArray(5);
        int result = -6;
        checkResults(result == arrayUtil.findMinNumber(arrayUtil.demoArray()), "shouldFindMinNumber Test");
    }
}
