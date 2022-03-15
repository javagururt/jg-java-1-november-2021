package student_mihails_nikolajevs.lesson_10_junit.level_1_intern_;

import java.math.BigDecimal;

public class TaxCalculatorDemo {

    public static void main(String[] args) {

        TaxCalculatorImpl taxCalculator = new TaxCalculatorImpl();

        System.out.println(taxCalculator.calculateTax(BigDecimal.valueOf(35000)));
        System.out.println(taxCalculator.calculateTax(BigDecimal.valueOf(50000)));
    }
}
