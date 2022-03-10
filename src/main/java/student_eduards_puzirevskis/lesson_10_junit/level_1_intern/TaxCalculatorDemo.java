package student_eduards_puzirevskis.lesson_10_junit.level_1_intern;

import java.math.BigDecimal;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class TaxCalculatorDemo {
    public static void main(String[] args) {
        TaxCalculatorImpl taxCalculator = new TaxCalculatorImpl();
        System.out.println(taxCalculator.calculateTax(BigDecimal.valueOf(30_000)));
        System.out.println(taxCalculator.calculateTax(BigDecimal.valueOf(41_221)));
        System.out.println(taxCalculator.calculateTax(BigDecimal.valueOf(50_000)));
        System.out.println(taxCalculator.calculateTax(BigDecimal.valueOf(55_000)));
    }

}
