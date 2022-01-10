package student_andrei_karamnov.lesson_6_arrays_while_loop.level_3_junior;

import java.util.Arrays;

class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.shouldFindCertainNumber();
        test.shouldFindCountOccurrences();
        test.shouldReplaceFirstNumber();
        test.shouldReplaceAll();
        test.shouldReverseArray();

    }

    public void shouldFindCertainNumber(){
        int[] numbers = {2, 4, 8, 9, 3, 7};
        ArrayService test = new ArrayService();
        checkTestResult(test.contains(numbers, 2), "shouldFindCertainNumber TEST");
        checkTestResult(test.contains(numbers, 1), "shouldFindCertainNumber TEST");
    }
    public void shouldFindCountOccurrences(){
        int[] numbers = {2, 3, 5, 5, 7, 8, 4, 5, 6, 8};
        ArrayService test = new ArrayService();
        checkTestResult2(test.countOccurrences(numbers, 8), 2, "shouldFindCountOccurrences TEST");
        checkTestResult2(test.countOccurrences(numbers, 5), 2, "shouldFindCountOccurrences TEST");
    }
    public void shouldReplaceFirstNumber(){
        System.out.println("");
        int[] numbers = {2, 4, 8, 9, 3, 7};
        int[] expectedNumbers = {3, 4, 8, 9, 3, 7};
        ArrayService test = new ArrayService();
        System.out.println("Array: " + Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            test.replaceFirst(numbers, numbers[0], 4 );
        }
        System.out.println("Replaced array: " + Arrays.toString(numbers));
        for (int i = 0; i < 1; i++) {

            boolean condition = (numbers[i] == expectedNumbers[i]);
        checkTestResult(condition,"shouldReplaceFirstNumber TEST");
        }
    }
    public void shouldReplaceAll(){
        System.out.println("");
        int[] numbers = {2, 4, 8, 9, 3, 7, 8, 9, 7, 3};
        int[] expectedNumbers = {2, 4, 9, 9, 3, 7, 9, 9, 7, 3};
        ArrayService test = new ArrayService();
        System.out.println("Array: " + Arrays.toString(numbers));
        test.replaceAll(numbers, 8, 9 );
        System.out.println("Replaced array: " + Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            boolean condition = (numbers[i] == expectedNumbers[i]);

            checkTestResult(condition, "shouldReplaceAll TEST");
        }
    }
    public void shouldReverseArray(){
        int[] numbers = {2, 4, 8, 9, 3, 7, 8, 9, 7, 3, 5};
        int[] expectedNumbers = {5, 3, 7, 9, 8, 7, 3, 9, 8, 4, 2};
        ArrayService test = new ArrayService();
        System.out.println("Array: " + Arrays.toString(numbers));
        test.revert(numbers);
        System.out.println("Reversed array: " + Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            boolean condition = (numbers[i] == expectedNumbers[i]);

            checkTestResult(condition, "shouldReversedArray TEST");
        }
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
    private void checkTestResult2(int condition,int expectedResult, String testName) {
        if (condition == expectedResult) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}
