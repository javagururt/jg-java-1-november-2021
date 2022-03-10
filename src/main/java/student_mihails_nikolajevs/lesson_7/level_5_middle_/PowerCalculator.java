package student_mihails_nikolajevs.lesson_7.level_5_middle_;

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
public class PowerCalculator {


    public double number;
    public int degreeNumber;

    public int getNumber() {
        System.out.println(" Please Enter Your Number : ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public int getDegree() {
        System.out.println(" Please Enter degree of Number : ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public double calculate(int number, int degreeNumber) {
        double result = 1;
        if (degreeNumber > 0) {
            for (int i = 1; i <= degreeNumber; i++) {
                result = result * number;
            }
            return result;
        }
        if (degreeNumber < 0) {
            for (int i = -1; i >= degreeNumber; i--) {
                result = (1 / number) * result;
            }
            return result;
        }
        return result;
    }

}


