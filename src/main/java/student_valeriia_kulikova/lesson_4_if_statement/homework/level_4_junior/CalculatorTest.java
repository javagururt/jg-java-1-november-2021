package student_valeriia_kulikova.lesson_4_if_statement.homework.level_4_junior;

public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.multiTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxOfTwoNumbersTest1();
        calculatorTest.maxOfTwoNumbersTest2();
        calculatorTest.maxOfTwoNumbersTest3();

    }

    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK.");
        } else {
            System.out.println("Sum test = FAIL.");
        }
    }
    public void subTest () {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.sub(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sub test = OK.");
        } else {
            System.out.println("Sub test = FAIL.");
        }
    }
    public void multiTest () {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int realResult = calculator.multi(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Multi test = OK.");
        } else {
            System.out.println("Multi test = FAIL.");
        }
    }
    public void divTest () {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.div(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Div test = OK.");
        } else {
            System.out.println("Div test = FAIL.");
        }
    }
    public void isEvenTest () {
        int firstNumber = 10;
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(firstNumber);
        if (realResult == expectedResult) {
            System.out.println("isEvenTest = OK.");
        } else {
            System.out.println("isEvenTest = Fail.");
        }
    }
    public void maxOfTwoNumbersTest1 () {
        int firstNumber = 6;
        int secondNumber = 4;
        int expectedResult = 6;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfTwoNumbersTest1 = OK.");
        } else {
            System.out.println("maxOfTwoNumbersTest1 = Fail.");
        }
    }
    public void maxOfTwoNumbersTest2 () {
        int firstNumber = 6;
        int secondNumber = 12;
        int expectedResult = 12;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfTwoNumbersTest2 = OK.");
        } else {
            System.out.println("maxOfTwoNumbersTest2 = Fail.");
        }
    }
    public void maxOfTwoNumbersTest3 () {
        int firstNumber = 12;
        int secondNumber = 12;
        int expectedResult = 12;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfTwoNumbersTest3 = OK.");
        } else {
            System.out.println("maxOfTwoNumbersTest3 = Fail.");
        }
    }

}
