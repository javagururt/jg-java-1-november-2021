package student_stanislav_p.lesson_8_inheritance.homework.level_7_senior.task_32;

import teacher.lesson_8_inheritance.homework.level_7_senior.task_32.MathOperation;
import teacher.lesson_8_inheritance.homework.level_7_senior.task_32.TwoArgumentMathOperation;

class Subtraction extends TwoArgumentMathOperation {

	public Subtraction(MathOperation leftArgument,
                       MathOperation rightArgument) {
		super(leftArgument, rightArgument);
	}

	@Override
	public double calculate() {
		return calculateLeftSide() - calculateRightSide();
	}
}

