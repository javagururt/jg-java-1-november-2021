package student_stanislav_p.lesson_7_encapsulation.level_5_middle;

public class PowerCalculatorTest {

    public static void main(String[] args) {

        PowerCalculatorTest calculatorTest = new PowerCalculatorTest();

        calculatorTest.test1("Test 1 ",2,3, 8);
        calculatorTest.test1("Test 2 ",3,5, 243);
        calculatorTest.test1("Test 3 ",5,0, 1);
        calculatorTest.test1("Test 4 ",2.5,3, 15.625);
        calculatorTest.test1("Test 5.1 ",-2,3, -8);
        calculatorTest.test1("Test 5.2 ",-2,4, 16);

    }

    void test1 (String testName, double x, int y , double expectedResult){
        PowerCalculator calculator = new PowerCalculator();

        double test1Result = calculator.multiPower(x,y);

        String fullNameTest = testName + x + " ^ " +y + " = " + expectedResult + " -> ";

        checkTestResult( fullNameTest, (test1Result==expectedResult) , true );

    }

    //--------------------------

    void checkTestResult(String nameTest, boolean realResult,  boolean expectedResult){

        if (realResult == expectedResult) {
            System.out.println(nameTest + " Control is OK");
        } else {
            System.out.println(nameTest + " Control is FAIL");
        }
    }
}
