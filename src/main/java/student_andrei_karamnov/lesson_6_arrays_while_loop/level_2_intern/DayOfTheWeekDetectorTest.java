package student_andrei_karamnov.lesson_6_arrays_while_loop.level_2_intern;

class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {
    DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();
    test.findDayOfTheWeekTest();
    test.shouldReturnMonday();
    test.shouldReturnTuesday();
    test.shouldReturnWednesday();
    test.shouldReturnThursday();
    test.shouldReturnFriday();
    test.shouldReturnSaturday();
    test.shouldReturnSunday();
    test.shouldReturnNotCorrectDayNumber();
    }
    public void findDayOfTheWeekTest(){
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String result = "Tuesday";
        chekResult("findDayOfTheWeek TEST", detector.findDayOfTheWeek(2), result);
    }

    void chekResult(String testName, String actual,String expected) {
        if (actual.equals (expected)){
            System.out.println(testName + " SUCESS \n" + "actual: " + actual + "\nexpected: " + expected);
        } else {
            System.out.println(testName + " FAILURE \n" + "actual: " + actual + "\nexpected: " + expected);
        }
    }
    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
    public void shouldReturnMonday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(1);
        checkTestResult("Monday".equals(dayOfTheWeek), "Monday");
    }
    public void shouldReturnTuesday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(2);
        checkTestResult("Tuesday".equals(dayOfTheWeek), "Tuesday");
    }
    public void shouldReturnWednesday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(3);
        checkTestResult("Wednesday".equals(dayOfTheWeek), "Wednesday");
    }
    public void shouldReturnThursday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(4);
        checkTestResult("Thursday".equals(dayOfTheWeek), "Thursday");
    }
    public void shouldReturnFriday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(5);
        checkTestResult("Friday".equals(dayOfTheWeek), "Friday");
    }
    public void shouldReturnSaturday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(6);
        checkTestResult("Saturday".equals(dayOfTheWeek), "Saturday");
    }
    public void shouldReturnSunday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(7);
        checkTestResult("Sunday".equals(dayOfTheWeek), "Sunday");
    }
    public void shouldReturnNotCorrectDayNumber() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(9);
        checkTestResult("Not correct day number".equals(dayOfTheWeek), "Not correct day number");
    }
}
