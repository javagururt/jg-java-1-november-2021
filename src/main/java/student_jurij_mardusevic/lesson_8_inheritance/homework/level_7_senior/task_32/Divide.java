package student_jurij_mardusevic.lesson_8_inheritance.homework.level_7_senior.task_32;

import teacher.lesson_8_inheritance.homework.level_7_senior.task_32.MathOperation;
import teacher.lesson_8_inheritance.homework.level_7_senior.task_32.TwoArgumentMathOperation;

class Divide extends TwoArgumentMathOperation {

	public Divide(MathOperation leftArgument,
                  MathOperation rightArgument) {
		super(leftArgument, rightArgument);
	}

	@Override
	public double calculate() {
		return calculateLeftSide() / calculateRightSide();
	}
}
