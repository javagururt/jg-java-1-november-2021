package student_rolands_gudels.lesson4_if_statement.level_4_junior;

public class CalculatorTest {

        public static void main(String[] args) {
            CalculatorTest calculatorTest = new CalculatorTest();
            calculatorTest.sumTest();
            calculatorTest.substractionTest();
            calculatorTest.divisionTest();
            calculatorTest.multiplicationTest();
            calculatorTest.isEvenTest();
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


    }

