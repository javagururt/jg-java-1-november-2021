package student_stanislav_p.lesson_5_arrays_for_loop.homework.level_5_middle;
/*
Создайте класс ArrayUtilTest.
В этом классе напишите автоматический тест
для метода int[] createArray(int arrayLength)
из предыдущего задания.

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
    }

    public void shouldCreateArray() {
        // Напишите реализацию !!!
        // Проверьте, что метод создаёт массив указанной длины
    }

}

----------------------------
Task 36
В классе ArrayUtilTest напишите автоматический тест
для метода int findMaxNumber(int[] array)
из предыдущего задания.

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
    }

    public void shouldCreateArray() {
        // Напишите реализацию !!!
    }

    public void shouldFindMaxNumber() {
        // Напишите реализацию !!!
    }
}

--------------------
Task 38
В классе ArrayUtilTest напишите автоматический тест
для метода int findMinNumber(int[] array)
из предыдущего задания.

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        // Напишите реализацию !!!
    }

    public void shouldFindMaxNumber() {
        // Напишите реализацию !!!
    }

    public void shouldFindMinNumber() {
        // Напишите реализацию !!!
    }
}
 */

public class ArrayUtilTest {
    public static void main(String[] args) {

        ArrayUtilTest test = new ArrayUtilTest();

        int arrayLength = 5;
        int bound = 100;
        int expectedResultLength = 5;
        int expectedResultMin = 3;
        int expectedResultMax = 99;

        int[] testArray = {10, 20, 87, 3, 99};


        test.shouldCreateArray(arrayLength, bound, expectedResultLength);

        test.shouldFindMaxNumber(testArray,expectedResultMax);

        test.shouldFindMinNumber(testArray,expectedResultMin);
    }

    void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + "  OK");
        } else {
            System.out.println(testName + "  FAIL");

        }
    }
    public void shouldCreateArray(int arrayLength, int bound, int expectedResult) {

        ArrayUtil arrayUtil = new ArrayUtil();
        arrayUtil.createNewArray(arrayLength, bound);

        checkResults(expectedResult == arrayUtil.arrayLength, "Test #1 - shouldCreateArray" );
    }
    public void shouldFindMaxNumber(int[] testArray, int expectedResultMax){
        ArrayUtil arrayUtil = new ArrayUtil();

        checkResults(expectedResultMax == arrayUtil.findMaxNumber(testArray), "Test #2 - shouldFindMax");
    //    System.out.println("expected  - " + expectedResultMax + " but result - " + arrayUtil.findMaxNumber(testArray));
    }
    public void shouldFindMinNumber(int[] testArray, int expectedResultMin){
        ArrayUtil arrayUtil = new ArrayUtil();

        checkResults(expectedResultMin == arrayUtil.findMinNumber(testArray), "Test #3 - shouldFindMin");
     //   System.out.println("expected  - " + expectedResultMin + " but result - " + arrayUtil.findMinNumber(testArray));
    }
}