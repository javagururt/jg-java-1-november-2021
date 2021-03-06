package student_stanislav_p.lesson_10_junit.homework.level_1_intern;

import java.math.BigDecimal;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class TaxCalculatorDemo {

    public static void main(String[] args) {

        TaxCalculatorImpl newCalculator = new TaxCalculatorImpl();

        System.out.println(newCalculator.calculateTax(BigDecimal.valueOf(0.00)));

        System.out.println(newCalculator.calculateTax(BigDecimal.valueOf(10000.00)));

        System.out.println(newCalculator.calculateTax(BigDecimal.valueOf(20000.00)));

        System.out.println(newCalculator.calculateTax(BigDecimal.valueOf(30000.00)));


    }
}
