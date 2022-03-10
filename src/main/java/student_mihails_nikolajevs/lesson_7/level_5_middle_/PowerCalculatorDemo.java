package student_mihails_nikolajevs.lesson_7.level_5_middle_;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class PowerCalculatorDemo {

    public static void main(String[] args) {

        PowerCalculator demo = new PowerCalculator();

        System.out.println(" RESULT OF EXPONENTIATION IS -> " + demo.calculate(demo.getNumber(), demo.getDegree()));
    }
}
