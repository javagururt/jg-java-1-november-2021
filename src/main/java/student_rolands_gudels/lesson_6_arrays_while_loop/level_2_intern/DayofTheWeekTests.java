package student_rolands_gudels.lesson_6_arrays_while_loop.level_2_intern;

public class DayofTheWeekTests {
    public static void main(String[] args) {
        DayofTheWeekTests dayofTheWeekTests = new DayofTheWeekTests();
        dayofTheWeekTests.borderTestOne();
        dayofTheWeekTests.borderTestTwo();
        dayofTheWeekTests.borderTestThree();
        dayofTheWeekTests.borderTestFour();
        dayofTheWeekTests.borderTestTuesday();
        dayofTheWeekTests.borderTestWednesday();
        dayofTheWeekTests.borderTestTuesday();
        dayofTheWeekTests.borderTestFriday();
        dayofTheWeekTests.borderTestSaturday();
    }
    public void borderTestOne(){
        DayofTheWeekTests dayofTheWeekTests = new DayofTheWeekTests();
        dayofTheWeekTests.testResult("borderTestOne","Monday",DayOfTheWeekDetector.findDayOfTheWeek(1));
    }
    public void borderTestTuesday(){
        DayofTheWeekTests dayofTheWeekTests = new DayofTheWeekTests();
        dayofTheWeekTests.testResult("borderTestTuesday","Tuesday",DayOfTheWeekDetector.findDayOfTheWeek(2));
    }
    public void borderTestWednesday(){
        DayofTheWeekTests dayofTheWeekTests = new DayofTheWeekTests();
        dayofTheWeekTests.testResult("borderTestWednesday","Wednesday",DayOfTheWeekDetector.findDayOfTheWeek(3));
    }
    public void borderTestThursday(){
        DayofTheWeekTests dayofTheWeekTests = new DayofTheWeekTests();
        dayofTheWeekTests.testResult("borderTestThursday","Thursday",DayOfTheWeekDetector.findDayOfTheWeek(4));
    }
    public void borderTestFriday(){
        DayofTheWeekTests dayofTheWeekTests = new DayofTheWeekTests();
        dayofTheWeekTests.testResult("borderTestFriday","Friday",DayOfTheWeekDetector.findDayOfTheWeek(5));
    }
    public void borderTestSaturday(){
        DayofTheWeekTests dayofTheWeekTests = new DayofTheWeekTests();
        dayofTheWeekTests.testResult("borderTestSaturday","Saturday",DayOfTheWeekDetector.findDayOfTheWeek(6));
    }
    public void borderTestTwo(){
        DayofTheWeekTests dayofTheWeekTests = new DayofTheWeekTests();
        dayofTheWeekTests.testResult("borderTestTwo","Sunday",DayOfTheWeekDetector.findDayOfTheWeek(7));
    }
    public void borderTestThree(){
        DayofTheWeekTests dayofTheWeekTests = new DayofTheWeekTests();
        dayofTheWeekTests.testResult("borderTestThree","Not correct day number",DayOfTheWeekDetector.findDayOfTheWeek(8));
    }
    public void borderTestFour(){
        DayofTheWeekTests dayofTheWeekTests = new DayofTheWeekTests();
        dayofTheWeekTests.testResult("borderTestFour","Not correct day number",DayOfTheWeekDetector.findDayOfTheWeek(0));
    }
    public void testResult (String testname,String expected, String actual){
        if ((expected).equals (actual)) {
            System.out.println(testname+" Test PASSED");
        } else {
            System.out.println(testname+ " Test FAILED"+ " expected was " +expected+" but actual "+ actual);
        }
    }
}
