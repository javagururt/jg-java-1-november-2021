package student_andrei_karamnov.lesson_7_encapsulation.homework.level_5_middle;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class PowerCalculatorTest {
    public static void main(String[] args) {
        PowerCalculatorTest test = new PowerCalculatorTest();
        test.calculatorPowTest();
    }

    void calculatorPowTest() {
        PowerCalculator power = new PowerCalculator();
        passedOrFailed("powerCalculator TEST1", power.power(3, 3), 27);
        passedOrFailed("powerCalculator TEST2", power.power(3, -3), 0.037);
        passedOrFailed("powerCalculator TEST3", power.power(-3, 3), -27);
        passedOrFailed("powerCalculator TEST4", power.power(-3, -3), -0.037);
        passedOrFailed("powerCalculator TEST5", power.power(7, 6), 117649);
        passedOrFailed("powerCalculator TEST5", power.power(5, 9), 1953125);
    }

    void passedOrFailed(String testName, double actual, double expected) {
        if (actual == expected) {
            System.out.println(testName + " OK " + "actual: " + actual + " expected: " + expected);
        } else {
            System.out.println(testName + " FAILED " + "actual: " + actual + " expected: " + expected);
        }
    }
}
