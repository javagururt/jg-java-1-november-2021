package student_eduards_puzirevskis.lesson_7_encapsulation.level_5_middle;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class PowerCalculatorTest {

    public static void main(String[] args) {
        PowerCalculatorTest test = new PowerCalculatorTest();
        test.powerCalculatorTestOne();
        test.powerCalculatorTestTwo();
        test.powerCalculatorTestThree();
        test.powerCalculatorTestFour();
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = PASSED!");
        } else {
            System.out.println(testName + " = FAILURE!");
        }
    }

    private void powerCalculatorTestOne() {
        PowerCalculator calculator = new PowerCalculator();
        double number = 5;
        int degree = 5;
        double expectedResult = 3125;
        double realResult = calculator.calculate(number, degree);
        checkTestResult(expectedResult == realResult, "Power Calculator Test One");
    }

    private void powerCalculatorTestTwo() {
        PowerCalculator calculator = new PowerCalculator();
        double number = 4;
        int degree = -4;
        double expectedResult = 0.00390625;
        double realResult = calculator.calculate(number, degree);
        checkTestResult(expectedResult == realResult, "Power Calculator Test Two");
    }

    private void powerCalculatorTestThree() {
        PowerCalculator calculator = new PowerCalculator();
        double number = 25;
        int degree = 1;
        double expectedResult = 25;
        double realResult = calculator.calculate(number, degree);
        checkTestResult(expectedResult == realResult, "Power Calculator Test Three");
    }

    private void powerCalculatorTestFour() {
        PowerCalculator calculator = new PowerCalculator();
        double number = 25;
        int degree = 0;
        double expectedResult = 1;
        double realResult = calculator.calculate(number, degree);
        checkTestResult(expectedResult == realResult, "Power Calculator Test Four");
    }


}
