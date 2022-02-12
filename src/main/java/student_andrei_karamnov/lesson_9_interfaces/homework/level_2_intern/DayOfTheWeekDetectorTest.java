package student_andrei_karamnov.lesson_9_interfaces.homework.level_2_intern;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();
        test.detectDayByArrayTest();
        test.detectDayBySwitchTest();
        test.detectDayByIfTest();
    }

    void detectDayByArrayTest() {
        DayOfTheWeekDetectorArrayVersion arrayVersion = new DayOfTheWeekDetectorArrayVersion();
        String expectedResult = "Wednesday";
        String expectedResult2 = "Saturday";
        passOrFail("dayDetectByArray TEST 1: ", arrayVersion.detectDayName(3), expectedResult);
        passOrFail("dayDetectByArray TEST 2: ", arrayVersion.detectDayName(6), expectedResult2);
    }

    void detectDayBySwitchTest(){
        DayOfTheWeekDetectorSwitchVersion switchVersion = new DayOfTheWeekDetectorSwitchVersion();
        String expectedResult = "Tuesday";
        String expectedResult2 = "Friday";
        passOrFail("detectDayBySwitch TEST 1: ", switchVersion.detectDayName(2), expectedResult);
        passOrFail("detectDayBySwitch TEST 2: ", switchVersion.detectDayName(5), expectedResult2);
    }

    void detectDayByIfTest(){
        DayOfTheWeekDetectorIfVersion ifVersion = new DayOfTheWeekDetectorIfVersion();
        String expectedResult = "Thursday";
        String expectedResult2 = "Monday";
        passOrFail("detectDayByIf TEST 1: ", ifVersion.detectDayName(4), expectedResult);
        passOrFail("detectDayByIf TEST 2: ", ifVersion.detectDayName(1), expectedResult2);
    }

    void passOrFail(String testName, String actual, String expected) {
        if (actual.equals(expected)) {
            System.out.println(testName + " is OK " );
        } else {
            System.out.println(testName + " FAILED " );
        }
    }

}
