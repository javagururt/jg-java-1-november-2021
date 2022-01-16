package student_andrei_karamnov.lesson_7_encapsulation.homework.level_1_intern;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

class WordServiceTest {

    public static void main(String[] args) {
        WordServiceTest test = new WordServiceTest();
        test.isItWork();

    }
    void isItWork(){
        String text = "I love java and java loves me loves me";
        String expectedResult = "java";
        WordService test = new WordService();
        String realResult = test.findMostFrequentWord(text);
        boolean condition = (expectedResult.equals(realResult));
        checkTestResult(condition,"findMostFrequentWord TEST");
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}
