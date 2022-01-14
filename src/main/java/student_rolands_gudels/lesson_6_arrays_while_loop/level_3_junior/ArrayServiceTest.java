package student_rolands_gudels.lesson_6_arrays_while_loop.level_3_junior;

import java.util.Arrays;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();
        arrayServiceTest.truFalseTest1();
        arrayServiceTest.truFalseTest2();
        arrayServiceTest.truFalseTest3();
        arrayServiceTest.truFalseTest4();
        arrayServiceTest.countTest1();
        arrayServiceTest.countTest2();
        arrayServiceTest.countTest3();
        arrayServiceTest.countTest4();
        arrayServiceTest.replaceTest1();
        arrayServiceTest.replaceTest2();
        arrayServiceTest.replaceTest3();
        arrayServiceTest.replaceAllTest1();
        arrayServiceTest.replaceAllTest2();
        arrayServiceTest.replaceAllTest3();
        arrayServiceTest.replaceAllTest4();
        arrayServiceTest.revertTest();
        arrayServiceTest.sortTest();

    }

    int[] numbers = {1, 2, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
    int[] revertarray ={1,2,3};
    int[]testarray={3,2,1};
    int[] numbersForReplaceAllTest4 = {1, 2, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
    int[] needtobesorted = {5,6,9,8,7,2,3,1,4};
    int[] sorted = {1,2,3,4,5,6,7,8,9};

    void truFalseTest1() {
        ArrayService arrayService = new ArrayService();
        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();
        arrayServiceTest.trueOrFalse("truFalseTest1", true, arrayService.findNeededArrayNumber(numbers, 3));
    }

    void truFalseTest2() {
        ArrayService arrayService = new ArrayService();
        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();
        arrayServiceTest.trueOrFalse("truFalseTest2", false, arrayService.findNeededArrayNumber(numbers, 14));
    }

    void truFalseTest3() {
        ArrayService arrayService = new ArrayService();
        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();
        arrayServiceTest.trueOrFalse("truFalseTest3", false, arrayService.findNeededArrayNumber(numbers, 0));
    }

    void truFalseTest4() {
        ArrayService arrayService = new ArrayService();
        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();
        arrayServiceTest.trueOrFalse("truFalseTest4", false, arrayService.findNeededArrayNumber(numbers, -1));
    }

    void trueOrFalse(String testname, boolean expected, boolean actual) {
        if (expected == actual) {
            System.out.println(testname + " Passed");
        } else {
            System.out.println(testname + " Failed" + " actual was " + actual + " expected " + expected);
        }
    }

    void countPassedOrFailed(String testname, int expected, int actual) {
        if (expected == actual) {
            System.out.println(testname + " Passed");
        } else {
            System.out.println(testname + " Failed" + " actual was " + actual + " expected " + expected);
        }
    }

    void countTest1() {
        ArrayService arrayService = new ArrayService();
        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();
        arrayServiceTest.countPassedOrFailed("countTest1", 2, arrayService.countOccurrences(numbers, 2));
    }

    void countTest2() {
        ArrayService arrayService = new ArrayService();
        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();
        arrayServiceTest.countPassedOrFailed("countTest2", 1, arrayService.countOccurrences(numbers, 1));
    }

    void countTest3() {
        ArrayService arrayService = new ArrayService();
        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();
        arrayServiceTest.countPassedOrFailed("countTest3", 0, arrayService.countOccurrences(numbers, 27));
    }

    void countTest4() {
        ArrayService arrayService = new ArrayService();
        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();
        arrayServiceTest.countPassedOrFailed("countTest4", 0, arrayService.countOccurrences(numbers, -1));
    }

    void replaceFirstPassedOrFailed(String testname, boolean expected, boolean actual) {
        if (expected == actual) {
            System.out.println(testname + " Passed");
        } else {
            System.out.println(testname + " Failed" + " actual was " + actual + " expected " + expected);
        }
    }

    void replaceTest1() {
        ArrayService arrayService = new ArrayService();
        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();
        arrayServiceTest.replaceFirstPassedOrFailed("replaceTest1", true, arrayService.replaceFirst(numbers, 2, 999));
    }

    void replaceTest2() {
        ArrayService arrayService = new ArrayService();
        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();
        arrayServiceTest.replaceFirstPassedOrFailed("replaceTest2", false, arrayService.replaceFirst(numbers, -2, 666));
    }

    void replaceTest3() {
        ArrayService arrayService = new ArrayService();
        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();
        arrayServiceTest.replaceFirstPassedOrFailed("replaceTest3", false, arrayService.replaceFirst(numbers, 77, 676));
    }

    void replaceAllTest1() {
        ArrayService arrayService = new ArrayService();
        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();
        arrayServiceTest.countPassedOrFailed("replaceAllTest1", 1, arrayService.replaceAll((numbers), 7, 666));
    }

    void replaceAllTest2() {
        ArrayService arrayService = new ArrayService();
        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();
        arrayServiceTest.countPassedOrFailed("replaceAllTest2", 0, arrayService.replaceAll((numbers), 888, 666));
    }

    void replaceAllTest3() {
        ArrayService arrayService = new ArrayService();
        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();
        arrayServiceTest.countPassedOrFailed("replaceAllTest3", 0, arrayService.replaceAll((numbers), -1, 666));
    }

    void replaceAllTest4() {
        ArrayService arrayService = new ArrayService();
        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();
        arrayServiceTest.countPassedOrFailed("replaceAllTest4", 2, arrayService.replaceAll((numbersForReplaceAllTest4), 2, 666));
    }

    void revertTest(){
        ArrayService arrayService = new ArrayService();
        int[] actual = arrayService.revert(revertarray);
        /*System.out.print("actual ");
         for (int i=0;i<(arrayService.revert(revertarray)).length;i++){
             System.out.print((arrayService.revert(revertarray))[i]);
         }
        System.out.print("expected ");
         for (int i=0;i<testarray.length;i++){
             System.out.print(testarray[i]);
         }*/
        int[] expected = testarray;
        if (Arrays.equals(expected,actual)) {
            System.out.println("Revert test Passed");
        } else {System.out.println("Revert test Failed");
        }
    }

    void sortTest(){
        ArrayService arrayService = new ArrayService();
        int[] expected = sorted;
        int[] actual = arrayService.sort(needtobesorted);
        if (Arrays.equals(actual,expected)) {
            System.out.println("Sort test Passed");
        } else {
            System.out.println("Sort test Failed");
        }
    }


}

