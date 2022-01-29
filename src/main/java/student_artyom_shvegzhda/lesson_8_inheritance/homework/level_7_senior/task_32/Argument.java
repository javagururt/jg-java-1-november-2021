package student_artyom_shvegzhda.lesson_8_inheritance.homework.level_7_senior.task_32;

import teacher.lesson_8_inheritance.homework.level_7_senior.task_32.MathOperation;

class Argument extends MathOperation {

	private double argument;

	public Argument(double argument) {
		this.argument = argument;
	}

	@Override
	public double calculate() {
		return argument;
	}
}
