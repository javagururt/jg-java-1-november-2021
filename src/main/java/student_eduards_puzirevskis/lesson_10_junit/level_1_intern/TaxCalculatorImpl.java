package student_eduards_puzirevskis.lesson_10_junit.level_1_intern;

import java.math.BigDecimal;

class TaxCalculatorImpl implements TaxCalculator {

    @Override
    public BigDecimal calculateTax(BigDecimal income) {
        int compareResult = income.compareTo(BigDecimal.valueOf(20_000));
        if (compareResult > 0) {
            return (income.subtract(BigDecimal.valueOf(20_000))
                    .multiply(BigDecimal.valueOf(0.40))
                    .add(BigDecimal.valueOf(5_000)));
        }
        return income.multiply(BigDecimal.valueOf(0.25));
    }




}
