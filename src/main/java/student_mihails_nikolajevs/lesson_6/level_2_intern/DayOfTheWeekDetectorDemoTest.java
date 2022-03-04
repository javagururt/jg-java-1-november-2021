package student_mihails_nikolajevs.lesson_6.level_2_intern;

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
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String day = "Monday";

        if (day.equals(dayOfTheWeekDetector.findDayOfTheWeek(1))) {
            System.out.println(" TEST DONE ");
        } else {
            System.out.println(" TEST FAILED ");
        }
   }

   public void shouldReturnMonday(){
       DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
       String dayOfTheWeek = dayOfTheWeekDetector.findDayOfTheWeek(1);
       checkTestResult("Monday".equals(dayOfTheWeek),"Monday");
   }

   public void shouldReturnTuesday(){
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String dayOfTheWeek = dayOfTheWeekDetector.findDayOfTheWeek(2);
        checkTestResult("Tuesday".equals(dayOfTheWeek),"Tuesday");
    }

    public void shouldReturnWednesday(){
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String dayOfTheWeek = dayOfTheWeekDetector.findDayOfTheWeek(3);
        checkTestResult("Wednesday".equals(dayOfTheWeek),"Wednesday");
    }

    public void shouldReturnThursday(){
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String dayOfTheWeek = dayOfTheWeekDetector.findDayOfTheWeek(4);
        checkTestResult("Thursday".equals(dayOfTheWeek),"Thursday");
    }

    public void shouldReturnFriday(){
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String dayOfTheWeek = dayOfTheWeekDetector.findDayOfTheWeek(5);
        checkTestResult("Friday".equals(dayOfTheWeek),"Friday");
    }

    public void shouldReturnSaturday(){
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String dayOfTheWeek = dayOfTheWeekDetector.findDayOfTheWeek(6);
        checkTestResult("Saturday".equals(dayOfTheWeek),"Saturday");
    }

    public void shouldReturnSunday(){
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String dayOfTheWeek = dayOfTheWeekDetector.findDayOfTheWeek(7);
        checkTestResult("Sunday".equals(dayOfTheWeek),"Sunday");
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}
