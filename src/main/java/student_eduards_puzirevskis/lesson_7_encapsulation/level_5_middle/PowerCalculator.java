package student_eduards_puzirevskis.lesson_7_encapsulation.level_5_middle;

import java.util.Scanner;

import teacher.annotations.CodeReview;

/*
Разработать класс PowerCalculator, который реализует единственный метод
для возведения заданного числа в указанную степень.
Название метода, список параметров и тип возвращаемого значения
придумайте самостоятельно согласно условию задачи.
Математическую операцию реализовать с использованием цикла.
Написать тестовые сценарии для класса PowerCalculator в классе PowerCalculatorTest.
Все тестовые сценарии должны отрабатывать без ошибок.
 */
@CodeReview(approved = true)
 class PowerCalculator {

    public double number;
    public int degree;


    public int getNumber() {
        System.out.println("Please, enter your number");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public int getDegree() {
        System.out.println("Please, enter degree");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public double calculate(double number, int degree) {
        double result = 1;
        if (degree > 0) {
            for (int i = 1; i <= degree; i++) {
                result = result * number;
            }
            return result;
        }
        if (degree < 0) {
            for (int i = -1; i >= degree; i--) {
                result = (1 / number)*result;
            }
            return result;
        }
        return result;
    }

}
