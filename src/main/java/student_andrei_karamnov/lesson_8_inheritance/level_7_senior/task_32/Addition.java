package student_andrei_karamnov.lesson_8_inheritance.level_7_senior.task_32;

class Addition extends TwoArgumentMathOperation {

	public Addition(MathOperation leftArgument,
					MathOperation rightArgument) {
		super(leftArgument, rightArgument);
	}

	@Override
	public double calculate() {
		return calculateLeftSide() + calculateRightSide();
	}
}
