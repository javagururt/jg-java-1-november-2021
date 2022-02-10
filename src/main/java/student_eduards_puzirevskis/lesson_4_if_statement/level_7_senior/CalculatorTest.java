package student_eduards_puzirevskis.lesson_4_if_statement.level_7_senior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subtractionTest();
        calculatorTest.reverseSubtractionTest();
        calculatorTest.divisionTest();
        calculatorTest.reverseDivisionTest();
        calculatorTest.multiplicationTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxOfTwoNumbersTestOne();
        calculatorTest.maxOfTwoNumbersTestTwo();
        calculatorTest.maxOfTwoNumbersTestThree();
        calculatorTest.maxOfThreeNumbersTestOne();
        calculatorTest.maxOfThreeNumbersTestTwo();
        calculatorTest.maxOfThreeNumbersTestThree();
        calculatorTest.maxOfThreeNumbersTestFour();
        calculatorTest.maxOfThreeNumbersTestFive();
        calculatorTest.maxOfThreeNumbersTestSix();
        calculatorTest.maxOfThreeNumbersTestSeven();

    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = PASSED!");
        } else {
            System.out.println(testName + " = FAILURE!");
        }
    }

    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);
        checkTestResult(expectedResult == realResult, "Sum Test");
    }

    public void subtractionTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.subtraction(firstNumber, secondNumber);
        checkTestResult(expectedResult == realResult, "Subtraction Test");
    }

    public void reverseSubtractionTest() {
        int firstNumber = 10;
        int secondNumber = 20;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.reverseSubtraction(firstNumber, secondNumber);
        checkTestResult(expectedResult == realResult, "Reverse Subtraction Test");
    }

    public void divisionTest() {
        int firstNumber = 20;
        int secondNumber = 10;
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.division(firstNumber, secondNumber);
        checkTestResult(expectedResult == realResult, "Division Test");
    }

    public void reverseDivisionTest() {
        int firstNumber = 20;
        int secondNumber = 60;
        int expectedResult = 3;
        Calculator calculator = new Calculator();
        int realResult = calculator.reverseDivision(firstNumber, secondNumber);
        checkTestResult(expectedResult == realResult, "Reverse Division Test");
    }

    public void multiplicationTest() {
        int firstNumber = 5;
        int secondNumber = 3;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.multiplication(firstNumber, secondNumber);
        checkTestResult(expectedResult == realResult, "Multiplication Test");
    }

    public void isEvenTest() {
        int number = 6;
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);
        checkTestResult(expectedResult == realResult, "Is Even Test");
    }

    public void maxOfTwoNumbersTestOne() {
        int firstNumber = 6;
        int secondNumber = 4;
        String expectedResult = "firstNumber";
        Calculator calculator = new Calculator();
        String realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        checkTestResult(realResult.equals(expectedResult), "Max of two numbers Test one ");
    }

    public void maxOfTwoNumbersTestTwo() {
        int firstNumber = 6;
        int secondNumber = 8;
        String expectedResult = "secondNumber";
        Calculator calculator = new Calculator();
        String realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        checkTestResult(realResult.equals(expectedResult), "Max of two numbers Test two ");
    }

    public void maxOfTwoNumbersTestThree() {
        int firstNumber = 8;
        int secondNumber = 8;
        String expectedResult = "Numbers are equal";
        Calculator calculator = new Calculator();
        String realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        checkTestResult(realResult.equals(expectedResult), "Max of two numbers Test three ");
    }

    public void maxOfThreeNumbersTestOne() {
        int firstNumber = 8;
        int secondNumber = 6;
        int thirdNumber = 4;
        String expectedResult = "firstNumber";
        Calculator calculator = new Calculator();
        String realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        checkTestResult(realResult.equals(expectedResult), "Max of three numbers Test one ");
    }

    public void maxOfThreeNumbersTestTwo() {
        int firstNumber = 6;
        int secondNumber = 8;
        int thirdNumber = 4;
        String expectedResult = "secondNumber";
        Calculator calculator = new Calculator();
        String realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        checkTestResult(realResult.equals(expectedResult), "Max of three numbers Test two ");
    }

    public void maxOfThreeNumbersTestThree() {
        int firstNumber = 4;
        int secondNumber = 6;
        int thirdNumber = 8;
        String expectedResult = "ThirdNumber";
        Calculator calculator = new Calculator();
        String realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        checkTestResult(realResult.equals(expectedResult), "Max of three numbers Test three ");
    }

    public void maxOfThreeNumbersTestFour() {
        int firstNumber = 6;
        int secondNumber = 6;
        int thirdNumber = 4;
        String expectedResult = "FirstEqualsSecondAndBiggerThanThird";
        Calculator calculator = new Calculator();
        String realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        checkTestResult(realResult.equals(expectedResult), "Max of three numbers Test four ");
    }

    public void maxOfThreeNumbersTestFive() {
        int firstNumber = 6;
        int secondNumber = 4;
        int thirdNumber = 6;
        String expectedResult = "FirstEqualsThirdAndBiggerThanSecond";
        Calculator calculator = new Calculator();
        String realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        checkTestResult(realResult.equals(expectedResult), "Max of three numbers Test five ");

    }

    public void maxOfThreeNumbersTestSix() {
        int firstNumber = 4;
        int secondNumber = 6;
        int thirdNumber = 6;
        String expectedResult = "SecondEqualsThirdAndBiggerThanFirst";
        Calculator calculator = new Calculator();
        String realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        checkTestResult(realResult.equals(expectedResult), "Max of three numbers Test six ");
    }

    public void maxOfThreeNumbersTestSeven() {
        int firstNumber = 6;
        int secondNumber = 6;
        int thirdNumber = 6;
        String expectedResult = "AllAreEqual";
        Calculator calculator = new Calculator();
        String realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        checkTestResult(realResult.equals(expectedResult), "Max of three numbers Test seven ");
    }
}