package student_stanislav_p.lesson_4_if_statement.level_7_senior;

public class LeapYearTest {

    public static void main(String[] args) {


        LeapYearTest test = new LeapYearTest();

        test.testDevidedBy4();
        test.testDevidedBy100();
        test.testDividedBy400();
        test.normalYear();
    }

    public void testDevidedBy4() {
        LeapYear leapYear = new LeapYear();
        boolean expected = true;

        checkTest("Test #1 divide by 4",leapYear.LeapYear(2020),expected);
    }

    public void testDevidedBy100() {
        LeapYear leapYear = new LeapYear();
        boolean expected = true;
        checkTest("Test #2 divide by 100",leapYear.LeapYear(2000),expected);
    }

    public void testDividedBy400() {
        LeapYear leapYear = new LeapYear();
        boolean expected = true;
        checkTest("Test #3 divide by 400",leapYear.LeapYear(2000),expected);
    }

    public void normalYear() {
        LeapYear leapYear = new LeapYear();
        boolean expected = false;
        checkTest("normalYear",leapYear.LeapYear(2021),expected);
    }

    private void checkTest(String testName, boolean testResult, boolean expectedResult) {
        if (testResult==expectedResult) {
            System.out.println(testName + " -  OK");
        } else {
            System.out.println(testName + " -  FAIL");
        }
    }
}
