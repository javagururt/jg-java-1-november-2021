package student_victor_veselov.lesson_6.intern_2;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class DayOfTheWeekDetectorDemoTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorDemoTest test = new DayOfTheWeekDetectorDemoTest();
        test.findDayOfTheWeekTest();
        test.shouldReturnMonday();
        test.shouldReturnTuesday();
        test.shouldReturnWednesday();
        test.shouldReturnThursday();
        test.shouldReturnFriday();
        test.shouldReturnSaturday();
        test.shouldReturnSunday();
    }

    public void findDayOfTheWeekTest() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String day = "Monday";
        if (day.equals(detector.findDayOfTheWeek(1))) {
            System.out.println("Test done");
        } else {
            System.out.println("Test Failed");
        }
    }

    public void shouldReturnMonday(){
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(1);
        checkTestResult("Monday".equals(dayOfTheWeek),"Monday");
    }

    public void shouldReturnTuesday(){
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(2);
        checkTestResult("Tuesday".equals(dayOfTheWeek),"Tuesday");
    }

    public void shouldReturnWednesday(){
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(3);
        checkTestResult("Wednesday".equals(dayOfTheWeek),"Wednesday");
    }

    public void shouldReturnThursday(){
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(4);
        checkTestResult("Thursday".equals(dayOfTheWeek),"Thursday");
    }

    public void shouldReturnFriday(){
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(5);
        checkTestResult("Friday".equals(dayOfTheWeek),"Friday");
    }

    public void shouldReturnSaturday(){
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(6);
        checkTestResult("Saturday".equals(dayOfTheWeek),"Saturday");
    }

    public void shouldReturnSunday(){
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(7);
        checkTestResult("Sunday".equals(dayOfTheWeek),"Sunday");
    }

    private void checkTestResult(boolean condition, String testName){
        if(condition){
            System.out.println(testName + " = OK!");
        }else {
            System.out.println(testName + " = FAIL!");
        }
    }
}
