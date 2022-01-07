package student_dmitrijs_sinkevics.lesson_4.lvl_4_junior;

public class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxOfTwoNumbersFirstNumberTest();
        calculatorTest.maxOfTwoNumbersSecondNumberTest();
        calculatorTest.maxOfTwoNumbersEqualNumberTest();
        calculatorTest.maxOfThreeNumbersFirstNumberMaxTest();
        calculatorTest.maxOfThreeNumbersSecondNumberMaxTest();
        calculatorTest.maxOfThreeNumbersThirdNumberMaxTest();
        calculatorTest.maxOfThreeNumbersFirstAndSecondNumberEqualTest();
        calculatorTest.maxOfThreeNumbersSecondAndThirdNumberEqualTest();
        calculatorTest.maxOfThreeNumbersFirstAndThirdNumberEqualTest();
        calculatorTest.maxOfThreeNumbersAllNumberEqualTest();

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
            System.out.println("Sum test = FAIL");
        }
    }
    public void subTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.sub(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sub test = OK");
        } else {
            System.out.println("Sub test = FAIL");
        }
    }
    public void mulTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int realResult = calculator.mul(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Mul test = OK");
        } else {
            System.out.println("Mul test = FAIL");
        }
    }
    public void divTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int realResult =calculator.div(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Div test = OK");
        } else {
            System.out.println("Div test = FAIL");
        }
    }

    public void isEvenTest() {
        Calculator calculator = new Calculator();
        boolean realResult= calculator.isEven(10);
        System.out.println("IsEven test:" +realResult);
    }

    public void maxOfTwoNumbersFirstNumberTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult =calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("firstNumber is MAX from two numbers test = OK");
        } else {
            System.out.println("firstNumber is MAX from two numbers test  = FAIL");
        }
    }

    public void maxOfTwoNumbersSecondNumberTest() {
        int firstNumber = 10;
        int secondNumber = 20;
        int expectedResult = 20;
        Calculator calculator = new Calculator();
        int realResult =calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("secondNumber is MAX from two numbers test = OK");
        } else {
            System.out.println("secondNumber is MAX from two numbers test = FAIL");
        }
    }

    public void maxOfTwoNumbersEqualNumberTest() {
        int firstNumber = 20;
        int secondNumber = 20;
        int expectedResult = 20;
        Calculator calculator = new Calculator();
        int realResult =calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("firstNumber and secondNumber are equal test = OK");
        } else {
            System.out.println("firstNumber and secondNumber are equal test = FAIL");
        }
    }



    public void maxOfThreeNumbersFirstNumberMaxTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int thirdNumber = -1;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult =calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("firstNumber is MAX from three test = OK");
        } else {
            System.out.println("firstNumber is MAX from three test  = FAIL");
        }
    }

    public void maxOfThreeNumbersSecondNumberMaxTest() {
        int firstNumber = 10;
        int secondNumber = 50;
        int thirdNumber = -1;
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int realResult =calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("secondNumber is MAX from three test = OK");
        } else {
            System.out.println("secondNumber is MAX from three test  = FAIL");
        }
    }

    public void maxOfThreeNumbersThirdNumberMaxTest() {
        int firstNumber = 10;
        int secondNumber = 0;
        int thirdNumber = 1000;
        int expectedResult = 1000;
        Calculator calculator = new Calculator();
        int realResult =calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("thirdNumber is MAX from three test = OK");
        } else {
            System.out.println("thirdNumber is MAX from three test  = FAIL");
        }
    }

    public void maxOfThreeNumbersFirstAndSecondNumberEqualTest() {
        int firstNumber = 10;
        int secondNumber = 10;
        int thirdNumber = 0;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult =calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("firstNumber and secondNumber are equal and larger than thirdNumber test = OK");
        } else {
            System.out.println("firstNumber and secondNumber are equal and larger than thirdNumber test = FAIL");
        }
    }

    public void maxOfThreeNumbersSecondAndThirdNumberEqualTest() {
        int firstNumber = 0;
        int secondNumber = 20;
        int thirdNumber = 20;
        int expectedResult = 20;
        Calculator calculator = new Calculator();
        int realResult =calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("secondNumber and thirdNumber are equal and larger than firstNumber test = OK");
        } else {
            System.out.println("secondNumber and thirdNumber are equal and larger than firstNumber test = FAIL");
        }
    }

    public void maxOfThreeNumbersFirstAndThirdNumberEqualTest() {
        int firstNumber = 30;
        int secondNumber = 0;
        int thirdNumber = 30;
        int expectedResult = 30;
        Calculator calculator = new Calculator();
        int realResult =calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("firstNumber and thirdNumber are equal and larger than secondNumber test = OK");
        } else {
            System.out.println("firstNumber and thirdNumber are equal and larger than secondNumber test = FAIL");
        }
    }

    public void maxOfThreeNumbersAllNumberEqualTest() {
        int firstNumber = 30;
        int secondNumber = 30;
        int thirdNumber = 30;
        int expectedResult = 30;
        Calculator calculator = new Calculator();
        int realResult =calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("all three numbers are equal test = OK");
        } else {
            System.out.println("all three numbers are equal test = FAIL");
        }
    }
}

