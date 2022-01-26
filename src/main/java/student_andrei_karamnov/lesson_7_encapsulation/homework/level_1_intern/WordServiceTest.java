package student_andrei_karamnov.lesson_7_encapsulation.homework.level_1_intern;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class WordServiceTest {

    public static void main(String[] args) {
        WordServiceTest test = new WordServiceTest();
        test.isItWork();
        WordService demo = new WordService();
        String text = "I love java and java loves me loves me";
        demo.findMostFrequentWord(text);

    }

    void isItWork(){
        String text1 = "I love java and java loves me loves me";
        String text2 = "hello world world hello goodbye night world good good day";
        String expectedResult1 = "java";
        String expectedResult2 = "world";
        WordService test = new WordService();
        String realResult1 = test.findMostFrequentWord(text1);
        String realResult2 = test.findMostFrequentWord(text2);
        boolean condition1 = (expectedResult1.equals(realResult1));
        boolean condition2 = (expectedResult2.equals(realResult2));
        checkTestResult(condition1,"findMostFrequentWord TEST1");
        checkTestResult(condition2,"findMostFrequentWord TEST2");
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}
