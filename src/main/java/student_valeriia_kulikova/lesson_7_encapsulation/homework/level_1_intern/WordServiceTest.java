package student_valeriia_kulikova.lesson_7_encapsulation.homework.level_1_intern;

import java.util.Arrays;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class WordServiceTest {
    public static void main(String[] args) {
        String[] testArray = new String[4];
        testArray[0] = "one";
        testArray[1] = "two";
        testArray[2] = "three";
        testArray[3] = "one";

        WordService test1 = new WordService();
        String[] test2 = test1.wordArray("one two three one");
        System.out.println("Test Array: " + Arrays.toString(testArray));
        System.out.println("Test test2: " + Arrays.toString(test2));

        Boolean testResult = Arrays.equals(testArray, test2);

        if (testResult) {
            System.out.println("Test 1 is " + testResult);
        } else {
            System.out.println("Test 1 is " + testResult);
        }

        int [] testArray2 = {2,1,1,2};
        int [] realResult = test1.createArrayCounter(test2);
        Boolean testResult2 = Arrays.equals(testArray2, realResult);
        if (testResult2) {
            System.out.println("Test 2 is " + testResult2);
        } else {
            System.out.println("Test 2 is " + testResult2);
        }


        String expectedResult3 = "one";
        String realResult3 = test1.finalSearch(test2, realResult);
        Boolean testResult3 = expectedResult3.equals(realResult3);
        if (testResult3) {
            System.out.println("Test 3 is " + testResult3);
        } else {
            System.out.println("Test 3 is " + testResult3);
        }


    }
}
