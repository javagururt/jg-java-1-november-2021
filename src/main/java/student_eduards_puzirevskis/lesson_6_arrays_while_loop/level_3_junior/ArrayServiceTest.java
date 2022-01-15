package student_eduards_puzirevskis.lesson_6_arrays_while_loop.level_3_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.shouldCreateArray();
        test.shouldFindMatchInArray();
        test.shouldNotFindMatchInArray();
        test.shouldCountOccurrences();
        test.shouldNotFindOccurrences();
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = PASSED!");
        } else {
            System.out.println(testName + " = FAILURE!");
        }
    }

    public void shouldCreateArray() {
        ArrayService arrayService = new ArrayService();
        int[] numbers = arrayService.createArray(5);
        int expectedResult = 5;
        checkTestResult(numbers.length == expectedResult, "Should Create Array");
    }

    public void shouldFindMatchInArray() {
        ArrayService arrayService = new ArrayService();
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int numberToFind = 7;
        checkTestResult(arrayService.findingMatchInArray(numbers, numberToFind), "Should FIND Match in Array");
    }

    public void shouldNotFindMatchInArray() {
        ArrayService arrayService = new ArrayService();
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int numberToFind = 11;
        checkTestResult(!arrayService.findingMatchInArray(numbers, numberToFind), "Should NOT FIND Match in Array");
    }

    public void shouldCountOccurrences() {
        ArrayService arrayService = new ArrayService();
        int[] numbers = {1,2,7,4,5,6,7,8,9,10};
        int numberToFind = 7;
        int expectedResult = 2;
        int realResult =  arrayService.countOccurrences(numbers, numberToFind);
        checkTestResult(expectedResult == realResult, "Should Count Occurrences in Array");
    }

    public void shouldNotFindOccurrences() {
        ArrayService arrayService = new ArrayService();
        int[] numbers = {1,2,7,4,5,6,7,8,9,10};
        int numberToFind = 11;
        int expectedResult = 0;
        int realResult =  arrayService.countOccurrences(numbers, numberToFind);
        checkTestResult(expectedResult == realResult, "Should Not Find Occurrences in Array");
    }


}
