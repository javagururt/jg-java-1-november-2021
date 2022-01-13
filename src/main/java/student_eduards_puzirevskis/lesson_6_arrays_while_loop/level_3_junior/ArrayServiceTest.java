package student_eduards_puzirevskis.lesson_6_arrays_while_loop.level_3_junior;

import java.util.Arrays;

class ArrayServiceTest {
     public static void main(String[] args) {
         ArrayServiceTest test = new ArrayServiceTest();
         test.shouldCreateArray();
         test.shouldFindMatchInArray();
         test.shouldNotFindMatchInArray();
         test.shouldCountOccurrences();
         test.shouldNotFindOccurrences();
         test.shouldReplaceNumber();
         test.shouldNotReplaceNumber();
         test.shouldReverseArray();
         test.shouldSortArray();
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

     public void shouldReplaceNumber() {
         ArrayService arrayService = new ArrayService();
         int[] numbers = {1,2,7,4,5,6,7,8,1,10};
         int numberToReplace = 1;
         int numberToInsert = 11;
         boolean expectedResult = true;
         boolean realResult = arrayService.replaceNumber(numbers, numberToReplace, numberToInsert);
         checkTestResult(expectedResult == realResult, "Should Replace Number");
     }

     public void shouldNotReplaceNumber() {
         ArrayService arrayService = new ArrayService();
         int[] numbers = {1,2,7,4,5,6,7,8,1,10};
         int numberToReplace = 11;
         int numberToInsert = 12;
         boolean expectedResult = false;
         boolean realResult = arrayService.replaceNumber(numbers, numberToReplace, numberToInsert);
         checkTestResult(expectedResult == realResult, "Should Not Replace Number");
     }

     public void shouldReverseArray() {
         ArrayService arrayService = new ArrayService();
         int[] numbers = {1,2,3,4,5,6,7,8,9,10};
         int[] expectedResult = {10,9,8,7,6,5,4,3,2,1};
         int[] realResult = arrayService.revert(numbers);
         checkTestResult(Arrays.equals(realResult, expectedResult), "Should Reverse Array");
     }

     public void shouldSortArray() {
         ArrayService arrayService = new ArrayService();
         int[] numbers = {5,8,2,6,1,10,3,9,4,7};
         int[] expectedResult = {1,2,3,4,5,6,7,8,9,10};
         int[] realResult = arrayService.sortFromSmallestToBiggest(numbers);
         checkTestResult(Arrays.equals(realResult, expectedResult), "Should Sort Array");
     }


}
