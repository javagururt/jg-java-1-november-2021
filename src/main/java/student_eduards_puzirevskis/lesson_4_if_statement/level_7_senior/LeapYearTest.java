package student_eduards_puzirevskis.lesson_4_if_statement.level_7_senior;

 class LeapYearTest {

     public static void main(String[] args) {
     LeapYearTest test = new LeapYearTest();
     test.shouldDetectLeapYear();
     test.shouldNotDetectLeapYear();
     }

     private void checkTestResult(boolean condition, String testName) {
         if (condition) {
             System.out.println(testName + " = PASSED!");
         } else {
             System.out.println(testName + " = FAILURE!");
         }
     }

     private void shouldDetectLeapYear() {
         LeapYear leapYear = new LeapYear();
         boolean expectedResult = true;
         boolean realResult = leapYear.isLeapYear(2020);
         checkTestResult(expectedResult==realResult, "Should Detect Leap Year Test");
     }

     private void shouldNotDetectLeapYear() {
         LeapYear leapYear = new LeapYear();
         boolean expectedResult = false;
         boolean realResult = leapYear.isLeapYear(1997);
         checkTestResult(expectedResult==realResult, "Should Not Detect Leap Year Test");
     }

}
