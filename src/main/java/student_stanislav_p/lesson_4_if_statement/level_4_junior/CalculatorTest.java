package student_stanislav_p.lesson_4_if_statement.level_4_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class CalculatorTest {

    public static void main(String[] args) {

        CalculatorTest calculatorTest = new CalculatorTest();

        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.multiTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest();
        calculatorTest.MaxOf2NumberTest();
        calculatorTest.MaxOf3NumberTest();
    }

        //----------------- Test1 SUM -----------------------

        public void sumTest() {
            int firstNumber = 25;
            int secondNumber = 5;
            int expectedResult = 30;

            Calculator calculator = new Calculator();

            int realResult = calculator.sum(firstNumber, secondNumber);
            if (realResult == expectedResult) {
                System.out.println("Test 1 ( sum ). Control is OK");
            } else {
                System.out.println("Test 1 ( sum ). Control is FAIL");
            }
        }
        //--------------- конец теста 1 ------------------

        //----------------- Test2 SUB -----------------------
        public void subTest() {
            int firstNumber = 25;
            int secondNumber = 5;
            int expectedResult = 20;

            Calculator calculator = new Calculator();

            int realResult = calculator.sub(firstNumber, secondNumber);

            if (realResult == expectedResult) {
                System.out.println("Test 2 ( sub ). Control is  OK");
            } else {
                System.out.println("Test 2 ( sub ). Control is FAIL");
            }
        }
        //--------------- конец теста 2 ------------------

        //----------------- Test3 MULTI -----------------------
        public void multiTest() {
            int firstNumber = 25;
            int secondNumber = 5;
            int expectedResult = 125;

            Calculator calculator = new Calculator();

            int realResult = calculator.multi(firstNumber, secondNumber);

            if (realResult == expectedResult) {
                System.out.println("Test 3 ( multi ). Control is  OK");
            } else {
                System.out.println("Test 3 ( multi ). Control is  FAIL");
            }
        }
        //--------------- конец теста 3 ------------------


        //----------------- Test4 DIV -----------------------
        public void divTest() {
            int firstNumber = 25;
            int secondNumber = 5;
            int expectedResult = 5;


            Calculator calculator = new Calculator();

            int realResult = calculator.div(firstNumber, secondNumber);

            if (realResult == expectedResult) {
                System.out.println("Test 4 ( div ). Control is  OK");
            } else {
                System.out.println("Test 4 ( div ). Control is FAIL");
            }
        }
        //--------------- конец теста 4 ------------------


        //----------------- Test5 isEven -----------------------
        public void isEvenTest() {

            int firstNumber = 25;
            boolean expectedResult = false;

            Calculator calculator = new Calculator();

            boolean realResult = calculator.isEven(firstNumber);

            if (realResult == expectedResult) {
                System.out.println("Test 5 ( even ). Control is  OK");
            } else {
                System.out.println("Test 5 ( even ). Control is FAIL");
            }
        }
        //--------------- конец теста 5 ------------------

        //----------------- Test6 MAX of 2 Numbers-----------------------
        public void MaxOf2NumberTest() {
            int firstNumber = 25;
            int secondNumber = 5;
            int expectedResult = 25;

            Calculator calculator = new Calculator();

            int realResult = calculator.maxOf2Number(firstNumber, secondNumber);

            if (expectedResult == realResult) {
                System.out.println("Test 6 ( max of 2 numbers ). Control is  OK");
            } else {
                System.out.println("Test 6 ( max of 2 numbers ). Control is  FAIL");
            }
        }
        //--------------- конец теста 6 ------------------


        //----------------- Test7 MAX of 3 Numbers-----------------------
        /*
        - первое число больше второго и третьего
        - второе число больше первого и третьего
        - третье число больше первого и второго
        - первые два равны и больше третьего
        - ...
        - три числа равны
        */

        public void MaxOf3NumberTest() {

        //Step1

            int firstNumber = 25;
            int secondNumber = 5;
            int thirdNumber = 2;
            int expectedResult = 25;


            Calculator calculator = new Calculator();

            int realResult = calculator.maxOf3Number(firstNumber, secondNumber, thirdNumber);

            if (expectedResult == realResult) {
                System.out.println("Test 6 step 1 ( max of 2 numbers ). Control is  OK");
            } else {
                System.out.println("Test 6 step 1 ( max of 2 numbers ). Control is  FAIL");
            }

            //Step2

            firstNumber = 5;
            secondNumber = 25;
            thirdNumber = 2;
            expectedResult = 25;

            realResult = calculator.maxOf3Number(firstNumber, secondNumber, thirdNumber);

            if (expectedResult == realResult) {
                System.out.println("Test 6 step 2 ( max of 2 numbers ). Control is  OK");
            } else {
                System.out.println("Test 6 step 2 ( max of 2 numbers ). Control is  FAIL");
            }

            //Step3

            firstNumber = 5;
            secondNumber = 20;
            thirdNumber = 25;
            expectedResult = 25;

            realResult = calculator.maxOf3Number(firstNumber, secondNumber, thirdNumber);

            if (expectedResult == realResult) {
                System.out.println("Test 6 step 3 ( max of 2 numbers ). Control is  OK");
            } else {
                System.out.println("Test 6 step 3 ( max of 2 numbers ). Control is  FAIL");
            }

            //Step4

            firstNumber = 25;
            secondNumber = 25;
            thirdNumber = 22;
            expectedResult = 25;

            realResult = calculator.maxOf3Number(firstNumber, secondNumber, thirdNumber);

            if (expectedResult == realResult) {
                System.out.println("Test 6 step 4 ( max of 2 numbers ). Control is  OK");
            } else {
                System.out.println("Test 6 step 4 ( max of 2 numbers ). Control is  FAIL");
            }

            //Step5

            firstNumber = 5;
            secondNumber = 25;
            thirdNumber = 25;
            expectedResult = 25;

            realResult = calculator.maxOf3Number(firstNumber, secondNumber, thirdNumber);

            if (expectedResult == realResult) {
                System.out.println("Test 6 step 5 ( max of 2 numbers ). Control is  OK");
            } else {
                System.out.println("Test 6 step 5 ( max of 2 numbers ). Control is  FAIL");
            }

            //Step6

            firstNumber = 25;
            secondNumber = 20;
            thirdNumber = 25;
            expectedResult = 25;

            realResult = calculator.maxOf3Number(firstNumber, secondNumber, thirdNumber);

            if (expectedResult == realResult) {
                System.out.println("Test 6 step 6 ( max of 2 numbers ). Control is  OK");
            } else {
                System.out.println("Test 6 step 6 ( max of 2 numbers ). Control is  FAIL");
            }

            //Step7

            firstNumber = 25;
            secondNumber = 25;
            thirdNumber = 25;
            expectedResult = 25;

            realResult = calculator.maxOf3Number(firstNumber, secondNumber, thirdNumber);

            if (expectedResult == realResult) {
                System.out.println("Test 6 step 7 ( max of 2 numbers ). Control is  OK");
            } else {
                System.out.println("Test 6 step 7 ( max of 2 numbers ). Control is  FAIL");
            }


            //--------------- конец теста 7 ------------------
        }


}
