package student_stanislav_p.lesson_9_interfaces.homework.level_2_intern;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class DayOfTheWeekDetectorTest {


    public static void main(String[] args) {


        DayOfTheWeekDetectorDemo testRun;

        testRun = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorArrayVersion());

        String testName = "Test for "+testRun.nameOfImplementation() + " method of implementation.";

        doTest(testRun,0,"Please input a valid number between 1 and 7", testName + " #1");
        doTest(testRun,1,"Monday", testName + " #2");
        doTest(testRun,7,"Sunday", testName + " #3");
        doTest(testRun,8,"Please input a valid number between 1 and 7", testName + " #4");


        testRun = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersion());

        testName = "Test for "+testRun.nameOfImplementation() + " method of implementation.";

        doTest(testRun,0,"Please input a valid number between 1 and 7", testName + " #1");
        doTest(testRun,1,"Monday", testName + " #2");
        doTest(testRun,7,"Sunday", testName + " #3");
        doTest(testRun,8,"Please input a valid number between 1 and 7", testName + " #4");


        testRun = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorSwitchVersion());

        testName = "Test for "+testRun.nameOfImplementation() + " method of implementation.";

        doTest(testRun,0,"Please input a valid number between 1 and 7", testName + " #1");
        doTest(testRun,1,"Monday", testName + " #2");
        doTest(testRun,7,"Sunday", testName + " #3");
        doTest(testRun,8,"Please input a valid number between 1 and 7", testName + " #4");


    }

    static void doTest (DayOfTheWeekDetectorDemo testRun, int dayNumber, String expectedResult, String nameTest){

        String actualResult = testRun.nameOfTheDay(dayNumber);

        boolean checkResult = (actualResult.equals(expectedResult));

        checkTestResult(checkResult,nameTest);

    }


    static void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }


}
