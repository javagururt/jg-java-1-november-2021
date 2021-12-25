package student_andrei_karamnov.lesson_4_if_statement.level_4_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class CalculatorTest<firstNumber, secondNumber, thirdNumber> {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxOfTwoNumbersTest();
        calculatorTest.maxOfThreeNumbers();
        // по аналогии реализуйте тесты для остальных методов
    }
    public void sumTest() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 15;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
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
        if (realResult == expectedResult){
            System.out.println("Sub test = OK");
        }else {
            System.out.println("Sub test = FAIL");
        }
    }
    public void mulTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int realResult = calculator.mul(firstNumber, secondNumber);
        if (realResult == expectedResult){
            System.out.println("Mul test = OK");
        }else {
            System.out.println("Mul test = FAIL");
        }
    }
    public void divTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.div(firstNumber, secondNumber);
        if (realResult == expectedResult){
            System.out.println("Div test = OK");
        }else {
            System.out.println("Div test = FAIL");
        }
    }
        public void isEvenTest(){
        int number = 9;
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        boolean reaResult = calculator.isEven(number);
        if (reaResult == expectedResult){
        System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
}
        public void maxOfTwoNumbersTest(){
            int firstNumber = 12;
            int secondNumber = 12;
            Calculator calculator = new Calculator();
            int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
            if (firstNumber == secondNumber) {
                System.out.println("Two numbers are equal");
            }else if (realResult == firstNumber){
                System.out.println("First number is greater");
            }else if (realResult != firstNumber) {
                System.out.println("Second number is greater");
            }
        }

    public void maxOfThreeNumbers() {
        int firstNumber = 19;
        int secondNumber = 17;
        int thirdNumber = 19;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == firstNumber) {
            System.out.println("First number is greater than third and second");
        } else if (realResult == secondNumber) {
            System.out.println("Second number is greater than first and third");
        } else if (realResult == thirdNumber) {
            System.out.println("Third number is greater than first and second");
        } else if (firstNumber == secondNumber && firstNumber > thirdNumber) {
            System.out.println("First number equals to second and greater than third");
        } else if (firstNumber == thirdNumber && firstNumber > secondNumber){
            System.out.println("First number equals to third and greater than second");
        } else if (secondNumber == thirdNumber && secondNumber > firstNumber) {
            System.out.println("Second number equals to third and greater than first");
        } else if (secondNumber == firstNumber && firstNumber == thirdNumber){
            System.out.println("All numbers are equal");
        }
    }}


