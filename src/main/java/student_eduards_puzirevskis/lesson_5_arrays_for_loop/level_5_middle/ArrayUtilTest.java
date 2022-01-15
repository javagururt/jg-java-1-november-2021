package student_eduards_puzirevskis.lesson_5_arrays_for_loop.level_5_middle;

import teacher.annotations.CodeReview;

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
 */
@CodeReview(approved = true)
class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();

    }

    public void shouldCreateArray() {
        ArrayUtil nextArray = new ArrayUtil();
        int[] numbers = nextArray.createArray(10);
        int expectedArrayLength = 10;
        if (expectedArrayLength == numbers.length) {
            System.out.println("Should create Array Test = TRUE");
        } else {
            System.out.println("Should create Array Test = FALSE. Expected result: " + expectedArrayLength + ". But actual: " + numbers.length);
        }
    }

    public void shouldFindMaxNumber() {
        ArrayUtil findingMaximum = new ArrayUtil();
        int[] numbers = {10,8,-12,6,2,78,79,15};
        int expectedResult = 79;
        int realResult = findingMaximum.findMaxNumber(numbers);
        if (expectedResult == realResult) {
            System.out.println("Should find Max number Test = TRUE");
        } else {
            System.out.println("Should find Max number Test = FALSE. Expected result: " + expectedResult + ". But actual: " + realResult);
        }
    }
    public void shouldFindMinNumber() {
        ArrayUtil findingMinimum = new ArrayUtil();
        int[] numbers = {10,8,-12,6,2,78,-13,15};
        int expectedResult = -13;
        int realResult = findingMinimum.findMinNumber(numbers);
        if (expectedResult == realResult) {
            System.out.println("Should find MIN number Test = TRUE");
        } else {
            System.out.println("Should find MIN number Test = FALSE. Expected result: " + expectedResult + ". But actual: " + realResult);
        }
    }

}
