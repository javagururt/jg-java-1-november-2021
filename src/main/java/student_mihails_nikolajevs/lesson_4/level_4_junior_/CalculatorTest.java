package student_mihails_nikolajevs.lesson_4.level_4_junior_;

public class CalculatorTest {

    public static void main(String[] args) {

        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.multiTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxOfTwoNumbersTest();


    }

    public void sumTest (){

        int firstNumber = 25;
        int secondNumber = 5;
        int expectedResult = 30;

        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("SUM TEST is OK.");
        } else {
            System.out.println("SUM TEST is FAIL.");
        }
    }

    public void subTest (){

        int firstNumber = 25;
        int secondNumber = 5;
        int expectedResult = 20;

        Calculator calculator = new Calculator();
        int realResult = calculator.sub(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("SUB TEST is OK.");
        } else {
            System.out.println("SUB TEST is FAIL.");
        }
    }
    public void multiTest (){

        int firstNumber = 25;
        int secondNumber = 5;
        int expectedResult = 125;

        Calculator calculator = new Calculator();
        int realResult = calculator.multi(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("MULTI TEST is OK.");
        } else {
            System.out.println("MULTI TEST is FAIL.");
        }
    }
    public void divTest (){

        int firstNumber = 25;
        int secondNumber = 5;
        int expectedResult = 5;

        Calculator calculator = new Calculator();
        int realResult = calculator.div(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("DIV TEST is OK.");
        } else {
            System.out.println("DIV TEST is FAIL.");
        }
    }
    public void isEvenTest (){

        int firstNumber = 20;

        boolean expectedResult = true;

        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(firstNumber);
        if (realResult == expectedResult) {
            System.out.println("isEvenTEST is OK.");
        } else {
            System.out.println("isEvenTEST is FAIL.");
        }
    }
    public void maxOfTwoNumbersTest () {
        int firstNumber = 10;
        int secondNumber = 20;
        int expectedResult = 20;

        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber,secondNumber);
        if (realResult == expectedResult) {
            System.out.println(" maxOfTwoNumbersTest = OK. ");
        } else {
            System.out.println(" maxOfTwoNumbersTest = FAIL. ");
        }
    }

}
