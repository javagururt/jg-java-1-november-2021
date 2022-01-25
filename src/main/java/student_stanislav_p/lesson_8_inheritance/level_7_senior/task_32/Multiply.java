package student_stanislav_p.lesson_8_inheritance.level_7_senior.task_32;

class Multiply extends TwoArgumentMathOperation {

	public Multiply(MathOperation leftArgument,
                    MathOperation rightArgument) {
		super(leftArgument, rightArgument);
	}

	@Override
	public double calculate() {
		return calculateLeftSide() * calculateRightSide();
	}
}

