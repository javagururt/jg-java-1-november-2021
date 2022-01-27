package student_stanislav_p.lesson_8_inheritance.level_7_senior.task_32;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
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
