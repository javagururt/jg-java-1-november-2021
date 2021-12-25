package student_jurij_mardusevic.lesson_4_if_statement.homework.level_7_senior.Task_24;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Calculator {

	public int sum(int firstNumber, int secondNumber) {
		return firstNumber + secondNumber;
	}

	public int sub(int firstNumber, int secondNumber) {
		return firstNumber - secondNumber;
	}

	public int mul(int firstNumber, int secondNumber) {
		return firstNumber * secondNumber;
	}

	public int div(int firstNumber, int secondNumber) {
		return firstNumber / secondNumber;
	}

	public boolean isEven(int number) {
		return number % 2 == 0;
	}

}