package student_andrei_karamnov.lesson_10_junit.level_1_intern;

import java.math.BigDecimal;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class TaxCalculatorImpl implements TaxCalculator {

    private double tax = 0.25;

    @Override
    public BigDecimal calculateTax(BigDecimal income) {
        if (income.compareTo(new BigDecimal("20000")) <= 0) {
            return income.multiply(BigDecimal.valueOf(tax));
        } else {
            var incomeBiggerThan20000 = income.subtract(new BigDecimal("20000"));
            var taxBefore20000 = new BigDecimal("20000").multiply(new BigDecimal("0.25"));
            var taxAfter20000 = incomeBiggerThan20000.multiply(new BigDecimal("0.40"));
            return taxAfter20000.add(taxBefore20000);
        }
    }
}
