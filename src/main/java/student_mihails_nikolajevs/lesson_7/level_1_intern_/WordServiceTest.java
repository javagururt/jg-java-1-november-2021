package student_mihails_nikolajevs.lesson_7.level_1_intern_;

import java.io.PrintStream;
import java.util.Scanner;

class WordServiceTest { // В классе WordServiceTest напишите тесты для всей задачи целиком.

    public static void main(String[] args) {

        WordServiceTest wordServiceTest = new WordServiceTest();
        wordServiceTest.CheckWord();
    }

    void CheckWord() {
        String expected = "Fish";

        WordService wordService = new WordService();
        String actual = wordService.print();

        boolean condition = (expected.equals(actual));
        check(condition, "Check");
    }

    private void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " SUCCESS ");
        } else {
            System.out.println(testName + " FAILED ");
        }
    }
}
