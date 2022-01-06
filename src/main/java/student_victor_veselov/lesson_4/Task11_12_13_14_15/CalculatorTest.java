package student_victor_veselov.lesson_4.Task11_12_13_14_15;

public class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.razTest();
        calculatorTest.delTest();
        calculatorTest.mulTest();
        System.out.println();
        calculatorTest.checkIsEven();
        System.out.println();
        calculatorTest.maxNumberTest();
        System.out.println();
        calculatorTest.minNumberTest();

    }

    public void checkIsEven() {
        Calculator calculator = new Calculator();
        System.out.println(calculator.isEven(3));
    }

    public void sumTest() { // Сложение
        int firstNumber = 5;
        int secondNumber = 20;
        int trueResult = 25;

        Calculator calculator = new Calculator();
        int result = calculator.sum(firstNumber, secondNumber);
        if (result == trueResult) {
            System.out.println("Sum test = DONE");
        } else {
            System.out.println("Sum test = Failed");
        }
    }

    public void razTest() { // Вычитание
        int firstNumber = 50;
        int secondNumber = 10;
        int trueResult = 40;

        Calculator calculator = new Calculator();
        int result = calculator.raz(firstNumber, secondNumber);
        if (result == trueResult) {
            System.out.println("Sum test = DONE");
        } else {
            System.out.println("Sum test = Failed");
        }
    }

    public void delTest() { // Деление
        int firstNumber = 36;
        int secondNumber = 6;
        int trueResult = 6;

        Calculator calculator = new Calculator();
        int result = calculator.del(firstNumber, secondNumber);
        if (result == trueResult) {
            System.out.println("Sum test = DONE");
        } else {
            System.out.println("Sum test = Failed");
        }
    }

    public void mulTest() {  //  Умножение
        int firstNumber = 5;
        int secondNumber = 5;
        int trueResult = 25;

        Calculator calculator = new Calculator();
        int result = calculator.mul(firstNumber, secondNumber);
        if (result == trueResult) {
            System.out.println("Sum test = DONE");
        } else {
            System.out.println("Sum test = Failed");
        }
    }

    public void maxNumberTest() { // Большие число
        int trueResult = 8;

        Calculator maxCalculator = new Calculator();
        int result = maxCalculator.maxNumber(8, 2, 3);
        if (result == trueResult) {
            System.out.println("Done!");
        } else {
            System.out.println("Failed!!!");
        }
    }

    public void minNumberTest() {
        int trueResult = 2;

        Calculator minCalculator = new Calculator();
        int result = minCalculator.minNumber(2,8,3);
        if(result == trueResult){
            System.out.println("Done1");
        }else {
            System.out.println("Failed");
        }
    }
}
