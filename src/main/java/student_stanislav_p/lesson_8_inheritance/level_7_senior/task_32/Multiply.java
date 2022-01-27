package student_stanislav_p.lesson_8_inheritance.level_7_senior.task_32;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
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

