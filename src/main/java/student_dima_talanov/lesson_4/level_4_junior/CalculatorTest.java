package student_dima_talanov.lesson_4.level_4_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subtractionTest();
        calculatorTest.multiplicationTest();
        calculatorTest.divisionTest();
        calculatorTest.parityTest();
        calculatorTest.FirstNumbersLargerTwoNumbersTest();
        calculatorTest.TwoNumbersLargerFirstNumbersTest();
        calculatorTest.FirstNumbersSecondNumbersEqual();
        calculatorTest.FirstNumbersLargerSecondNumbersAndThirdNumberTest();
        calculatorTest.SecondNumbersLargerFirstNumbersAndThirdNumberTest();
        calculatorTest.ThirdNumbersLargerFirstNumbersAndSecondNumberTest();
        calculatorTest.thirstNumberEqualSecondNumbersAndLargerThirdNumberTest();
        calculatorTest.secondNumberEqualThirdNumbersAndLargerFirstNumberTest();
        calculatorTest.firstNumberEqualThirdNumbersAndLargerSecondNumberTest();
        calculatorTest.FirstNumbersSecondNumbersThirdNumberEqualTest();
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

    public void FirstNumbersLargerTwoNumbersTest() {
        int firstNumber = 25;
        int secondNumber = 5;
        int expectedResult = 25;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOrEqualOfTwoNumbers(firstNumber, secondNumber);
        if (expectedResult == realResult) {
            System.out.println("Answer first number larger two number test: = OK");
        } else {
            System.out.println("Answer first number larger two number test: = FAIL");
        }
    }

    public void TwoNumbersLargerFirstNumbersTest() {
        int firstNumber = 5;
        int secondNumber = 25;
        int expectedResult = 25;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOrEqualOfTwoNumbers(firstNumber, secondNumber);
        if (expectedResult == realResult) {
            System.out.println("Answer two number larger first number test: = OK");
        } else {
            System.out.println("Answer two number larger first number test: = FAIL");
        }
    }

    public void FirstNumbersSecondNumbersEqual() {
        int firstNumber = 5;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOrEqualOfTwoNumbers(firstNumber, secondNumber);
        if (expectedResult == realResult) {
            System.out.println("Answer first number, second number equal test: = OK");
        } else {
            System.out.println("Answer first number, second number equal test: = FAIL");
        }
    }

    public void FirstNumbersLargerSecondNumbersAndThirdNumberTest() {
        int firstNumber = 25;
        int secondNumber = 5;
        int thirdNumber = 3;
        int expectedResult = 25;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOrEqualOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (expectedResult == realResult) {
            System.out.println("Answer first number larger second number and third numbers test: = OK");
        } else {
            System.out.println("Answer first number larger second number and third numbers test: = FAIL");
        }
    }

    public void SecondNumbersLargerFirstNumbersAndThirdNumberTest() {
        int firstNumber = 5;
        int secondNumber = 25;
        int thirdNumber = 3;
        int expectedResult = 25;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOrEqualOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (expectedResult == realResult) {
            System.out.println("Answer second number larger first number and third numbers test: = OK");
        } else {
            System.out.println("Answer second number larger first number and third numbers test: = FAIL");
        }
    }

    public void ThirdNumbersLargerFirstNumbersAndSecondNumberTest() {
        int firstNumber = 3;
        int secondNumber = 5;
        int thirdNumber = 25;
        int expectedResult = 25;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOrEqualOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (expectedResult == realResult) {
            System.out.println("Answer third number larger first number and second numbers test: = OK");
        } else {
            System.out.println("Answer third number larger first number and second numbers test: = FAIL");
        }
    }

    public void thirstNumberEqualSecondNumbersAndLargerThirdNumberTest() {
        int firstNumber = 25;
        int secondNumber = 25;
        int thirdNumber = 5;
        int expectedResult = 25;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOrEqualOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (expectedResult == realResult) {
            System.out.println("Answer thirst number equal second number and larger third numbers test: = OK");
        } else {
            System.out.println("Answer thirst number equal second number and larger third numbers test: = FAIL");
        }
    }

    public void secondNumberEqualThirdNumbersAndLargerFirstNumberTest() {
        int firstNumber = 5;
        int secondNumber = 25;
        int thirdNumber = 25;
        int expectedResult = 25;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOrEqualOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (expectedResult == realResult) {
            System.out.println("Answer second number equal third number and larger first numbers test: = OK");
        } else {
            System.out.println("Answer second number equal third number and larger first numbers test: = FAIL");
        }
    }

    public void firstNumberEqualThirdNumbersAndLargerSecondNumberTest() {
        int firstNumber = 25;
        int secondNumber = 5;
        int thirdNumber = 25;
        int expectedResult = 25;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOrEqualOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (expectedResult == realResult) {
            System.out.println("Answer first number equal third number and larger second numbers test: = OK");
        } else {
            System.out.println("Answer first number equal third number and larger second numbers test: = FAIL");
        }
    }

    public void FirstNumbersSecondNumbersThirdNumberEqualTest() {
        int firstNumber = 5;
        int secondNumber = 5;
        int thirdNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOrEqualOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (expectedResult == realResult) {
            System.out.println("Answer first number, second number, third numbers equal test: = OK");
        } else {
            System.out.println("Answer first number, second number, third numbers equal test: = FAIL");
        }
    }
}