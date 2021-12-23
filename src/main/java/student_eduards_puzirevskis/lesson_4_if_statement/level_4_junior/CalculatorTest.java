package student_eduards_puzirevskis.lesson_4_if_statement.level_4_junior;

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

    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = Fail");
        }
    }

    public void subtractionTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.subtraction(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Subtraction test = OK");
        } else {
            System.out.println("Subtraction test = Fail");
        }
    }

    public void reverseSubtractionTest() {
        int firstNumber = 10;
        int secondNumber = 20;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.reverseSubtraction(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Reverse Subtraction test = OK");
        } else {
            System.out.println("Reverse Subtraction test = Fail");
        }
    }

    public void divisionTest() {
        int firstNumber = 20;
        int secondNumber = 10;
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.division(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Division test = OK");
        } else {
            System.out.println("Division test = Fail");
        }
    }

    public void reverseDivisionTest() {
        int firstNumber = 20;
        int secondNumber = 60;
        int expectedResult = 3;
        Calculator calculator = new Calculator();
        int realResult = calculator.reverseDivision(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Reverse Division test = OK");
        } else {
            System.out.println("Reverse Division test = Fail");
        }
    }

    public void multiplicationTest() {
        int firstNumber = 5;
        int secondNumber = 3;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.multiplication(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Multiplication test = OK");
        } else {
            System.out.println("Multiplication test = Fail");
        }
    }

    public void isEvenTest() {
        int number = 6;
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);
        if (realResult == expectedResult) {
            System.out.println("Is Even test = OK");
        } else {
            System.out.println("Is Even test = Fail");
        }
    }

    public void maxOfTwoNumbersTestOne() {
        int firstNumber = 6;
        int secondNumber = 4;
        String expectedResult = "firstNumber";
        Calculator calculator = new Calculator();
        String realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult.equals(expectedResult)) {
            System.out.println("Max of two numbers Test One = OK");
        } else {
            System.out.println("Max of two numbers Test One = Fail");
        }

    }

    public void maxOfTwoNumbersTestTwo() {
        int firstNumber = 6;
        int secondNumber = 8;
        String expectedResult = "secondNumber";
        Calculator calculator = new Calculator();
        String realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult.equals(expectedResult)) {
            System.out.println("Max of two numbers Test Two = OK");
        } else {
            System.out.println("Max of two numbers Test Two = Fail");
        }

    }

    public void maxOfTwoNumbersTestThree() {
        int firstNumber = 8;
        int secondNumber = 8;
        String expectedResult = "Numbers are equal";
        Calculator calculator = new Calculator();
        String realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult.equals(expectedResult)) {
            System.out.println("Max of two numbers Test Three = OK");
        } else {
            System.out.println("Max of two numbers Test Three = Fail");
        }

    }

    public void maxOfThreeNumbersTestOne() {
        int firstNumber = 8;
        int secondNumber = 6;
        int thirdNumber = 4;
        String expectedResult = "firstNumber";
        Calculator calculator = new Calculator();
        String realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult.equals(expectedResult)) {
            System.out.println("Max of three numbers Test One = OK");
        } else {
            System.out.println("Max of three numbers Test One = Fail");
        }
    }
    public void maxOfThreeNumbersTestTwo() {
        int firstNumber = 6;
        int secondNumber = 8;
        int thirdNumber = 4;
        String expectedResult = "secondNumber";
        Calculator calculator = new Calculator();
        String realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult.equals(expectedResult)) {
            System.out.println("Max of three numbers Test Two = OK");
        } else {
            System.out.println("Max of three numbers Test Two = Fail");
        }
    }
    public void maxOfThreeNumbersTestThree() {
        int firstNumber = 4;
        int secondNumber = 6;
        int thirdNumber = 8;
        String expectedResult = "ThirdNumber";
        Calculator calculator = new Calculator();
        String realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult.equals(expectedResult)) {
            System.out.println("Max of three numbers Test Three = OK");
        } else {
            System.out.println("Max of three numbers Test Thre = Fail");
        }
    }
    public void maxOfThreeNumbersTestFour() {
        int firstNumber = 6;
        int secondNumber = 6;
        int thirdNumber = 4;
        String expectedResult = "FirstEqualsSecondAndBiggerThanThird";
        Calculator calculator = new Calculator();
        String realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult.equals(expectedResult)) {
            System.out.println("Max of three numbers Test Four = OK");
        } else {
            System.out.println("Max of three numbers Test Four = Fail");
        }
    }
    public void maxOfThreeNumbersTestFive() {
        int firstNumber = 6;
        int secondNumber = 4;
        int thirdNumber = 6;
        String expectedResult = "FirstEqualsThirdAndBiggerThanSecond";
        Calculator calculator = new Calculator();
        String realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult.equals(expectedResult)) {
            System.out.println("Max of three numbers Test Five = OK");
        } else {
            System.out.println("Max of three numbers Test Five = Fail");
        }
    }
    public void maxOfThreeNumbersTestSix() {
        int firstNumber = 4;
        int secondNumber = 6;
        int thirdNumber = 6;
        String expectedResult = "SecondEqualsThirdAndBiggerThanFirst";
        Calculator calculator = new Calculator();
        String realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult.equals(expectedResult)) {
            System.out.println("Max of three numbers Test Six = OK");
        } else {
            System.out.println("Max of three numbers Test Six = Fail");
        }
    }
    public void maxOfThreeNumbersTestSeven() {
        int firstNumber = 6;
        int secondNumber = 6;
        int thirdNumber = 6;
        String expectedResult = "AllAreEqual";
        Calculator calculator = new Calculator();
        String realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult.equals(expectedResult)) {
            System.out.println("Max of three numbers Test Seven = OK");
        } else {
            System.out.println("Max of three numbers Test Seven = Fail");
        }
    }



}