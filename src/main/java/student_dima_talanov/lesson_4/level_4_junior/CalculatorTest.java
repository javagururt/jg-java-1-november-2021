package student_dima_talanov.lesson_4.level_4_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subtractionTest();
        calculatorTest.multiplicationTest();
        calculatorTest.divisionTest();
        calculatorTest.parityTest();
        calculatorTest.maxOrEqualOfTwoNumbers();
    }
    public void sumTest() {
        int firstNumber = 25;
        int secondNumber = 5;
        int expectedResult = 30;
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Answer sum test: = OK");
        } else {
            System.out.println("Answer sum test: = FAIL");
        }
    }
    public void subtractionTest() {
        int firstNumber = 25;
        int secondNumber = 5;
        int expectedResult = 20;
        Calculator calculator = new Calculator();
        int realResult = calculator.subtraction(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Answer subtraction test: = OK");
        } else {
            System.out.println("Answer subtraction test: = FAIL");
        }
    }
    public void multiplicationTest() {
        int firstNumber = 25;
        int secondNumber = 5;
        int expectedResult = 125;
        Calculator calculator = new Calculator();
        int realResult = calculator.multiplication(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Answer multiplication test: = OK");
        } else {
            System.out.println("Answer multiplication test: = FAIL");
        }
    }
    public void divisionTest() {
        int firstNumber = 25;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.division(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Answer division test: = OK");
        } else {
            System.out.println("Answer division test: = FAIL");
        }
    }
    public void parityTest() {
        int firstNumber = 25;
        int expectedResult = 0;
        Calculator calculator = new Calculator();
        int realResult = calculator.parity(firstNumber);
        if (realResult == expectedResult) {
            System.out.println("Answer parity test: = OK");
        } else {
            System.out.println("Answer parity test: = FAIL");
        }
    }
    public void maxOrEqualOfTwoNumbers() {
        int firstNumber = 25;
        int secondNumber = 5;
        int expectedResult = 25;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOrEqualOfTwoNumbers(firstNumber, secondNumber);
        if (expectedResult  == realResult) {
            System.out.println("Answer maxOrEqualOfTwoNumbers test: = OK");
        } else {
            System.out.println("Answer maxOrEqualOfTwoNumbers test: = FAIL");
        }
    }
}
