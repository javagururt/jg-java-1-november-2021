package student_rolands_gudels.lesson4_if_statement.level_4_junior;

 class CalculatorTest {

        public static void main(String[] args) {
            CalculatorTest calculatorTest = new CalculatorTest();
            calculatorTest.sumTest();
            calculatorTest.substractionTest();
            calculatorTest.divisionTest();
            calculatorTest.multiplicationTest();
            calculatorTest.isEvenTest();
            calculatorTest.maxOfTwoNumbersTestWhereFirstNumberIsBiggerThanSecond();
            calculatorTest.maxOfTwoNumbersTestWhereSecondNumberIsBiggerThanFirst();
            calculatorTest.maxOfTwoNumbersTestWhereAllNumbersAreTheSame();
            calculatorTest.maxOfThreeNumbersWhereFirstsIsBiggerThanSecondAndThird();
            calculatorTest.maxOfThreeNumbersWhereSecondIsBiggerThanFirstAndThird();
            calculatorTest.maxOfThreeNumbersWhereThirdIsBiggerThanFirstAndSecond();
            calculatorTest.maxOfThreeNumbersWhereFirstTwoAreTheSameAndBiggerThanThird();
            calculatorTest.maxOfThreeNumbersWhereAllNumbersAreTheSame();
        }
        public void sumTest() {
            int firstNumber = 10;
            int secondNumber = 5;
            int expectedResult = 15;
            Task_11.Calculator calculator = new Task_11.Calculator();
            int realResult = calculator.sum(firstNumber, secondNumber);
            if (realResult == expectedResult) {
                System.out.println("Sum test = OK");
            } else {
                System.out.println("Sum test = FAIL");
            }
        }
    public void substractionTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;
        Task_11.Calculator calculator = new Task_11.Calculator();
        int realResult = calculator.substraction(firstNumber, secondNumber);
            if (realResult == expectedResult) {
        System.out.println("Substraction test = OK");
        } else {
        System.out.println("Substraction test = FAIL");
     }
    }
    public void divisionTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 2;
        Task_11.Calculator calculator = new Task_11.Calculator();
        int realResult = calculator.division(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Division test = OK");
        } else {
            System.out.println("Division test = FAIL");
        }
    }
    public void multiplicationTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;
        Task_11.Calculator calculator = new Task_11.Calculator();
        int realResult = calculator.multiplication(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Multiplication test = OK");
        } else {
            System.out.println("Multiplication test = FAIL");
        }
    }
    public void isEvenTest() {
        int number = 10;
        Task_11.Calculator calculator = new Task_11.Calculator();
        boolean realResult = calculator.isEven(number);
        if (realResult == true) {
            System.out.println("isEven test = OK");
        } else {
            System.out.println("isEven test = FAIL");
        }
    }

    public void maxOfTwoNumbersTestWhereFirstNumberIsBiggerThanSecond() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 10;
        Task_11.Calculator calculator = new Task_11.Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("MaxOfTwoNumbers test 1 where first number is bigger than second = OK");
        } else {
            System.out.println("MaxOfTwoNumbers test 1 where first number is bigger than second = FAIL");
        }
    }
    public void maxOfTwoNumbersTestWhereSecondNumberIsBiggerThanFirst() {
        int firstNumber = 5;
        int secondNumber = 10;
        int expectedResult = 10;
        Task_11.Calculator calculator = new Task_11.Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("MaxOfTwoNumbers test 2 where second number is bigger than first = OK");
        } else {
            System.out.println("MaxOfTwoNumbers test 2 where second number is bigger than first = FAIL");
        }
    }
    public void maxOfTwoNumbersTestWhereAllNumbersAreTheSame() {
        int firstNumber = 10;
        int secondNumber = 10;
        int expectedResult = 0;
        Task_11.Calculator calculator = new Task_11.Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("MaxOfTwoNumbers test 3 where numbers are the same = OK");
        } else {
            System.out.println("MaxOfTwoNumbers test 3 where numbers are the same = FAIL");
        }
    }
    public void maxOfThreeNumbersWhereFirstsIsBiggerThanSecondAndThird() {
        int firstNumber = 10;
        int secondNumber = 5;
        int thirdNumber = 6;
        int expectedResult = 10;
        Task_11.Calculator calculator = new Task_11.Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber );
        if (realResult == expectedResult) {
            System.out.println("MaxOfThreeNumbers test 1 where first number is bigger than others two = OK");
        } else {
            System.out.println("MaxOfThreeNumbers test 1 where first number is bigger than others two = FAIL");
        }
    }
    public void maxOfThreeNumbersWhereSecondIsBiggerThanFirstAndThird() {
        int firstNumber = 5;
        int secondNumber = 10;
        int thirdNumber = 6;
        int expectedResult = 10;
        Task_11.Calculator calculator = new Task_11.Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber );
        if (realResult == expectedResult) {
            System.out.println("MaxOfThreeNumbers test 2 where second number is bigger than others two = OK");
        } else {
            System.out.println("MaxOfThreeNumbers test 2 where second number is bigger than others two = FAIL");
        }
    }
    public void maxOfThreeNumbersWhereThirdIsBiggerThanFirstAndSecond() {
        int firstNumber = 5;
        int secondNumber = 6;
        int thirdNumber = 10;
        int expectedResult = 10;
        Task_11.Calculator calculator = new Task_11.Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber );
        if (realResult == expectedResult) {
            System.out.println("MaxOfThreeNumbers test 3 where third number is bigger than others two = OK");
        } else {
            System.out.println("MaxOfThreeNumbers test 3 where third number is bigger than others two = FAIL");
        }
    }
    public void maxOfThreeNumbersWhereFirstTwoAreTheSameAndBiggerThanThird() {
        int firstNumber = 10;
        int secondNumber = 10;
        int thirdNumber = 5;
        int expectedResult = 0;
        Task_11.Calculator calculator = new Task_11.Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber );
        if (realResult == expectedResult) {
            System.out.println("MaxOfThreeNumbers test 4 where first and second numbers are the same and are bigger than third = OK");
        } else {
            System.out.println("MaxOfThreeNumbers test 4 where first and second numbers are the same and are bigger than third = FAIL");
        }
    }
    public void maxOfThreeNumbersWhereAllNumbersAreTheSame() {
        int firstNumber = 10;
        int secondNumber = 10;
        int thirdNumber = 10;
        int expectedResult = 0;
        Task_11.Calculator calculator = new Task_11.Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber );
        if (realResult == expectedResult) {
            System.out.println("MaxOfThreeNumbers test 5 where all numbers are the same = OK");
        } else {
            System.out.println("MaxOfThreeNumbers test 5 where all numbers are the same = FAIL");
        }
    }


    }

