package student_valeriia_kulikova.lesson_7_encapsulation.homework.level_5_middle;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class PowerCalculatorDemo {
    public static void main(String[] args) {
        PowerCalculator calculator = new PowerCalculator();
        calculator.Calculate();
        System.out.println(calculator.Calculate());

    }
}
