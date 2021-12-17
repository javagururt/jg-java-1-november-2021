package student_jurij_mardusevic.lesson_4_if_statement.homework.level_7_senior.Task_24;

import teacher.lesson_4_if_statement.homework.level_7_senior.solutions.super_task_3.Calculator;

class CalculatorTest {

	public static void main(String[] args) {
		CalculatorTest calculatorTest = new CalculatorTest();
		calculatorTest.sumTest();
		calculatorTest.subTest();
		calculatorTest.mulTest();
		calculatorTest.divTest();
		calculatorTest.isEvenTest(40);
	}

	public void sumTest() {
		int firstNumber = 35;
		int secondNumber = 40;
		teacher.lesson_4_if_statement.homework.level_7_senior.solutions.super_task_3.Calculator calculator = new teacher.lesson_4_if_statement.homework.level_7_senior.solutions.super_task_3.Calculator();
		int result = calculator.sum(firstNumber, secondNumber);
		checkResults(result == 75, "Sum test");
	}

	public void subTest() {
		int firstNumber = 35;
		int secondNumber = 15;
		teacher.lesson_4_if_statement.homework.level_7_senior.solutions.super_task_3.Calculator calculator = new teacher.lesson_4_if_statement.homework.level_7_senior.solutions.super_task_3.Calculator();
		int result = calculator.sub(firstNumber, secondNumber);
		checkResults(result == 20, "Sub test");
	}

	public void mulTest() {
		int firstNumber = 5;
		int secondNumber = 5;
		teacher.lesson_4_if_statement.homework.level_7_senior.solutions.super_task_3.Calculator calculator = new teacher.lesson_4_if_statement.homework.level_7_senior.solutions.super_task_3.Calculator();
		int result = calculator.mul(firstNumber, secondNumber);
		checkResults(result == 25, "Mul test");
	}

	public void divTest() {
		int firstNumber = 40;
		int secondNumber = 8;
		teacher.lesson_4_if_statement.homework.level_7_senior.solutions.super_task_3.Calculator calculator = new teacher.lesson_4_if_statement.homework.level_7_senior.solutions.super_task_3.Calculator();
		int result = calculator.div(firstNumber, secondNumber);
		checkResults(result == 5, "Div test");
	}

	public void isEvenTest(int testValue) {
		teacher.lesson_4_if_statement.homework.level_7_senior.solutions.super_task_3.Calculator calculator = new Calculator();
		boolean result = calculator.isEven(testValue);
		checkResults(result, "isEven test");
	}

	private void checkResults(boolean condition, String testName) {
		if (condition) {
			System.out.println(testName + " = OK");
		} else {
			System.out.println(testName + " = FAIL");
		}
	}

}