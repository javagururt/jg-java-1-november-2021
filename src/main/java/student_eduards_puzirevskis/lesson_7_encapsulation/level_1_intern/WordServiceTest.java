package student_eduards_puzirevskis.lesson_7_encapsulation.level_1_intern;

import java.util.Arrays;
import java.util.Objects;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class WordServiceTest {
    public static void main(String[] args) {
        WordServiceTest test = new WordServiceTest();
        test.shouldConvertTextInToArray();
        test.shouldFindIndexOfMaximalInArray();
        test.shouldCreateArrayToCount();
        test.shouldFindMostFrequentWord();
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = PASSED!");
        } else {
            System.out.println(testName + " = FAILURE!");
        }
    }

    private void shouldConvertTextInToArray(){
        WordService wordService = new WordService();
        String victim = "you should never forget, that you can do everything!";
        String[] expectedResult = {"you","should","never","forget","that","you","can","do","everything"};
        String[] realResult = wordService.convertTextInToArray(victim);
        checkTestResult(Arrays.equals(expectedResult, realResult), "Should Convert Text In To Array Test");
    }

    private void shouldFindIndexOfMaximalInArray() {
        WordService wordService = new WordService();
        int[] victim = {1,2,3,6,5};
        int realResult = wordService.findIndexForMostFrequentWord(victim);
        int expectedResult = 3;
        checkTestResult(realResult==expectedResult, "Should Find Index Of Maximal in Array Test");
    }

    private void shouldCreateArrayToCount() {
        WordService wordService = new WordService();
        String[] victim = {"you","should","never","forget","that","you","can","do","everything"};
        int[] realResult = wordService.createArrayToCount(victim);
        int[] expectedResult = {0,0,0,0,0,0,0,0,0};
        checkTestResult(Arrays.equals(realResult, expectedResult), "Should Create Array To Count Test");
    }

    private void shouldFindMostFrequentWord() {
        WordService wordService = new WordService();
        String victim = "you should never forget, that you should can do everything!";
        String expectedResult = "you";
        String realResult = wordService.findMostFrequentWord(victim);
        checkTestResult(Objects.deepEquals(expectedResult, realResult), "Should Find Most Frequent Word Test");
    }

}
